package academy.learnprogramming;

import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(String name, double duration) {
        this.songs.add(new Song(name, duration));
    }

    public Song findSong(String name) {
        for (Song song : songs) {
            if (song.getTitle().equals(name)) {
                return song;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
