public class Song {
    private String name;
    private String lyrics;
    private int trackLengthInSec;
    private String producer;
    private int releaseYear;

    public Song (String name, String lyrics, int trackLengthInSec, String producer, int releaseYear, String artistName, boolean explicitRating){

        this.name = name;
        this.lyrics = lyrics;
        this.artistName = artistName;
        this.explicitRating = explicitRating;
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.trackLengthInSec = trackLengthInSec;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public int getTrackLengthInSec() {
        return trackLengthInSec;
    }

    public void setTrackLengthInSec(int trackLengthInSec) {
        this.trackLengthInSec = trackLengthInSec;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean isExplicitRating() {
        return explicitRating;
    }

    public void setExplicitRating(boolean explicitRating) {
        this.explicitRating = explicitRating;
    }

    private String artistName;
    private boolean explicitRating;


}
