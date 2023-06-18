package guru.qa;

import java.util.TreeSet;

public class MusicAlbum {
    private String artist;
    private String title;
    private int year_of_release;
    private String genre;
    private boolean isIndie;
    private MusicAlbum[] otherGreatAlbums2023;
    private TreeSet<MusicAlbum> bestAlbums2023Set;

    public MusicAlbum(String artist, String title, int year_of_release,
                      String genre, boolean isIndie) {
        this.artist = artist;
        this.title = title;
        this.year_of_release = year_of_release;
        this.genre = genre;
        this.isIndie = isIndie;

    }

    public void addAlbum(MusicAlbum[] otherGreatAlbums2023) {
        this.otherGreatAlbums2023 = otherGreatAlbums2023;
    }

    public void printGreatAlbums2023() {
        for (int i = 0; i < otherGreatAlbums2023.length; i++) {
            System.out.println(otherGreatAlbums2023[i]);
        }
    }

    public void printGreatAlbums2023ByArtistIfPresent(String artist) {
        for (int i = 0; i < otherGreatAlbums2023.length; i++) {
            MusicAlbum greatAlbum = otherGreatAlbums2023[i];
            if (greatAlbum.artist.equals(artist)) {
                System.out.println(greatAlbum);
                return;
            }
        }
        System.out.println("Not found");
    }

    public MusicAlbum() {
        this.bestAlbums2023Set = new TreeSet<MusicAlbum>();
    }

    public void addAlbumToSet(MusicAlbum value) {
        this.bestAlbums2023Set.add(value);
    }

    public void removeAlbum(MusicAlbum value) {
        this.bestAlbums2023Set.remove(value);
    }

    public boolean findAlbum(MusicAlbum value) {
        for (MusicAlbum i : this.bestAlbums2023Set) {
            if (i.equals(value))
                return true;
        }
        return false;
    }


    public void printAlbums() {
        for (MusicAlbum i : this.bestAlbums2023Set) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return artist + " " + "-" + " " + title + " " + "(" + year_of_release + ")" + ","
                + " " + genre + "," + " " + isIndie + ".";
    }
}
