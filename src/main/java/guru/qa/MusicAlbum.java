package guru.qa;

public class MusicAlbum {
    private String artist;
    private String title;
    private int year_of_release;
    private String genre;
    private boolean isIndie;

    public MusicAlbum(String artist, String title, int year_of_release,
                      String genre, boolean isIndie) {
        this.artist = artist;
        this.title = title;
        this.year_of_release = year_of_release;
        this.genre = genre;
        this.isIndie = isIndie;

    }

    @Override
    public String toString() {
        return artist + " " + "-" + " " + title + " " + "(" + year_of_release + ")" + ","
                + " " + genre + "," + " " + isIndie;
    }
}
