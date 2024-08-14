package br.com.cod3r.flyweight.musicPlayer.after.model;

import br.com.cod3r.flyweight.musicPlayer.after.musicFlyweight.MusicFlyweight;

public class Music {

    private Integer playerQty;
    private MusicFlyweight musicFlyweight;

    public Music(MusicFlyweight musicFlyweight) {
        this.musicFlyweight = musicFlyweight;
        this.playerQty = 0;
    }

    public void listenning() {
        playerQty++;
    }

    public Integer getPlayerQty() {
        return playerQty;
    }

    public void setPlayerQty(Integer playerQty) {
        this.playerQty = playerQty;
    }

    public MusicFlyweight getMusicFlyweight() {
        return musicFlyweight;
    }

    public void setMusicFlyweight(MusicFlyweight musicFlyweight) {
        this.musicFlyweight = musicFlyweight;
    }

    @Override
    public String toString() {
        return "Music{" +
                "playerQty=" + playerQty +
                ", musicFlyweight=" + musicFlyweight +
                '}';
    }
}
