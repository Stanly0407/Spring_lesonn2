package springLes2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(MusicGenerator generator) {
        Random random = new Random();
        //случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        if(generator == MusicGenerator.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (generator == MusicGenerator.ROCK) {
            System.out.println(rockMusic.getSong().get(randomNumber));
        } else {
            System.out.println(popMusic.getSong().get(randomNumber));
        }
    }
}


//    Например, внедрение зависимости через setter
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    тоже самое через поле!
//    @Autowired
//    private Music music;

//    через конструктор
//    @Autowired
//    public MusicPlayer(Music music) { this.music = music;}

//    @Autowired
//    @Qualifier("classicalMusic") //т.е. решаем проблему необнозначности и указываем какой конкретно бин внедрять
//    private  Music music;

//    это же, но через конструктор, с учетом специфического синтаксиса для конструктора.
//    т.е. аннотацию @Qualifier необходимо поставить к каждому аргументу конструктора:
//
//     public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                   @Qualifier("classicalMusic") Music music2)
//    {this.music1 = music1;
//    this.music2 = music2; }