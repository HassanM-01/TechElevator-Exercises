import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songsList = new ArrayList<>();

public void addSong (Song song){
    songsList.add(song);
}

    public void viewPlayList() {
        for (Song song: songsList) {
            System.out.println(song.getName());
        }
    }




}
