package br.com.cod3r.iterator.tvChannel.after;

import br.com.cod3r.iterator.tvChannel.after.tv.TV;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.searchAvaiableChannels();

        for (Integer channel : tv) {
            tv.accessChannel(channel);
        }
    }
}
