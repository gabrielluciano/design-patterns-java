package br.com.cod3r.iterator.tvChannel.before;

import java.util.Random;

public class TV {
	private Integer[] channels;
	
	public void searchAvaiableChannels() {
		this.channels = new Integer[30];
		Random r = new Random();
		int channelsCount = 0;
		for(int i = 0; i < channels.length; i++) {
			if(r.nextInt(2) == 1) {
				channels[channelsCount++] = i;
			}
		}
		System.out.printf("Found %d channels...%n", channelsCount);
	}

	public void accessChannel(Integer number) {
		System.out.printf("Channel %d: ", number);
		for(int i = 0; i < channels.length; i++) {
			if(channels[i] == number) {
				System.out.println("OK!");
				return;
			}
		}
		System.out.println("No signal!");
	}
}
