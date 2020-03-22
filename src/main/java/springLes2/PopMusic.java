package springLes2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PopMusic implements Music {
    List<String> popPlaylist = new ArrayList<>();
    {
        popPlaylist.add("Bilie jean");
        popPlaylist.add("Hello");
        popPlaylist.add("Merry Christmas");
    }

    @Override
    public List<String> getSong() {
        return popPlaylist;
    }
}
