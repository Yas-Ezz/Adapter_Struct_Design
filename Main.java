package org.example;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "clip.vlc");
        audioPlayer.play("avi", "unsupported.avi");
    }
}