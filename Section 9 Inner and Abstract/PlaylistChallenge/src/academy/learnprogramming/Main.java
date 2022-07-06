package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AlbumCollection collection = new AlbumCollection();
        LinkedList<Song> playlist = new LinkedList<>();

        collection.createAlbum("Use Your Illusion 1");
        collection.addSongToAlbum("Use Your Illusion 1", "Right Next Door To Hell", 3.03);
        collection.addSongToAlbum("Use Your Illusion 1", "Live and Let Die", 3.04);
        collection.addSongToAlbum("Use Your Illusion 1", "Perfect Crime", 2.24);

        collection.createAlbum("Bad");
        collection.addSongToAlbum("Bad", "Bad", 4.07);
        collection.addSongToAlbum("Bad", "Speed Demon", 4.0);
        collection.addSongToAlbum("Bad", "Just Good Friends", 4.06);

        playlist.add(collection.findSong("Use Your Illusion 1", "Perfect Crime"));
        playlist.add(collection.findSong("Bad", "Bad"));
        playlist.add(collection.findSong("Use Your Illusion 1", "Live and Let Die"));
        playlist.add(collection.findSong("Bad", "Just Good Friends"));

        ListIterator<Song> playListIterator = playlist.listIterator();
        Song currentSong = playListIterator.next();
        int selectedOption = 1;
        Boolean goingForward = true;
        displayMenu();
        while (selectedOption != 9) {
            System.out.print("option: ");
            selectedOption = scanner.nextInt();
            System.out.println("");

            switch (selectedOption) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    if (!goingForward && playListIterator.hasNext()) {
                        playListIterator.next();
                    }

                    if (playListIterator.hasNext()) {
                        currentSong = playListIterator.next();
                        goingForward = true;
                    } else {
                        System.out.println("At the end of the playlist!!!");
                    }
                    break;
                case 3:
                    if (goingForward && playListIterator.hasPrevious()) {
                        playListIterator.previous();
                    }

                    if (playListIterator.hasPrevious()) {
                        currentSong = playListIterator.previous();
                        goingForward = false;
                    } else {
                        System.out.println("At the beginning of the playlist!!!");
                    }
                    break;
                case 4:
                    //do nothing
                    break;
                case 5:
                    playListIterator.remove();
                    if (playListIterator.hasNext()) {
                        currentSong = playListIterator.next();
                    } else {
                        currentSong = playListIterator.previous();
                    }
                    break;
                case 9:
                    break;
            }

            displaySongDetails(currentSong);
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("1 - Display options menu");
        System.out.println("2 - Skip to next song");
        System.out.println("3 - Rewind to previous song");
        System.out.println("4 - Replay current song");
        System.out.println("5 - Remove current song from playlist");
        System.out.println("9 - Quit");
    }

    private static void displaySongDetails(Song song) {
        System.out.println("Currently playing title: " + song.getTitle() + " duration: " + song.getDuration());
    }

    private static void moveForward(Boolean goingForward, ListIterator<Song> playListIterator, Song currentSong) {
        if (!goingForward && playListIterator.hasNext()) {
            playListIterator.next();
        }

        if (playListIterator.hasNext()) {
            currentSong = playListIterator.next();
            goingForward = true;
        } else {
            System.out.println("At the end of the playlist!!!");
        }
    }

    private static void moveBackward(Boolean goingForward, ListIterator<Song> playListIterator, Song currentSong) {
        if (goingForward && playListIterator.hasPrevious()) {
            playListIterator.previous();
        }

        if (playListIterator.hasPrevious()) {
            currentSong = playListIterator.previous();
            goingForward = false;
        } else {
            System.out.println("At the beginning of the playlist!!!");
        }
    }

}
