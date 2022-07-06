package academy.learnprogramming;

import java.util.ArrayList;

public class Album {

    private String name;
    private SongList songList;

    public Album(String name) {
        this.name = name;
        songList = new SongList();
    }

    public void addSong(String name, double duration) {
        this.songList.addSong(name, duration);
    }

    public Song findSong(String name) {
       return this.songList.findSong(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return this.songList.getSongs();
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
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

        public ArrayList<Song> getSongs() {
            return this.songs;
        }
    }
}
