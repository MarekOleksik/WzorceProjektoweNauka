package homework.workshop.command;

import homework.workshop.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play() {
        musicPlayer.playNextTrack();
    }

}