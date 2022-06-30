package academy.learnprogramming;

import java.util.ArrayList;

public class AlbumCollection {

    private ArrayList<Album> albums;

    public AlbumCollection() {
        this.albums = new ArrayList<>();
    }

    public void createAlbum(String name) {
        this.albums.add(new Album(name));
    }

    public void addSongToAlbum(String albumName, String songName, double duration) {
        Album foundAlbum = findAlbum(albumName);
        foundAlbum.addSong(songName, duration);
    }

    public Song findSong(String albumName, String songName) {
        Album foundAlbum = findAlbum(albumName);
        return foundAlbum.findSong(songName);
    }

    private Album findAlbum(String name) {
        for (Album album : this.albums) {
            if (album.getName().equals(name)) {
                return album;
            }
        }
        return null;
    }

}
