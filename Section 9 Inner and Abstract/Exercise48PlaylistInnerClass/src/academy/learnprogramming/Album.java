package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist) {
        int trackIndex = trackNo - 1;
        Song song = songs.findSong(trackIndex);
        if (null != song) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        } else {
            return false;
        }
    }

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
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

        private Song findSong(int track) {
            if (songs.size() >= track) {
                return songs.get(track);
            }
            return null;
        }
    }
}
