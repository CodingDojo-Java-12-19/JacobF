import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Track 1", "Test Lyrics");
        trackList.put("Track 2", "Test Lyrics 2");
        trackList.put("Track 3", "Test Lyrics 3");
        trackList.put("Track 4", "Test Lyrics 4");
        String thisTrack = trackList.get("Track 1");
        System.out.println(thisTrack);
        Set<String> lyrics = trackList.keySet();
        for(String track: lyrics) {
            System.out.println(track);
            System.out.println(trackList.get(track));    
        }
    }
}