package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist) {
        int trackIndex = trackNo - 1;
        if (trackIndex >=0 && trackIndex <= songs.size()) {
            Song song = songs.get(trackIndex);
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
