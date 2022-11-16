package learningjava;

import learningjava.model.Artist;
import learningjava.model.Datasource;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        //List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_NONE);
        //ORDER_BY_ASC; ORDER_BY_DESC;
        List<Artist> artists = datasource.queryArtists(5);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " +
                    artist.getName());
        }
        datasource.close();
    }
}