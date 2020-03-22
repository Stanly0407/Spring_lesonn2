package springLes2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Component
public class RockMusic implements Music {
    List <String> rockPlaylist = new ArrayList<>();
    {
        rockPlaylist.add("Wind cries Mary");
        rockPlaylist.add("Twilight zone");
        rockPlaylist.add("HardRock");
    }

    @Override
    public List<String> getSong() {
        return rockPlaylist;
    }
}
