package springLes2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{
    List<String> classicalPlaylist= new ArrayList<>();
        //блок инфиициализации объекта класса, выполняется каждый раз, когда создается объект класс
    {
        classicalPlaylist.add("Hungarian Rhapsody");
        classicalPlaylist.add("Piano Sonata No. 14");
        classicalPlaylist.add("Flight of the Bumblebee");
    }

    @Override
    public List<String> getSong() {
        return classicalPlaylist;
    }
}
