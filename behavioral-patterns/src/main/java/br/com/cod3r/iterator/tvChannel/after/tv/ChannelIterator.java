package br.com.cod3r.iterator.tvChannel.after.tv;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ChannelIterator implements Iterator<Integer> {
    private final Integer[] channels;
    private int currentIndex;

    public ChannelIterator(Integer[] channels) {
        this.channels = channels;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        if (channels == null) return false;
        return channels[currentIndex] != null;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        return channels[currentIndex++];
    }
}
