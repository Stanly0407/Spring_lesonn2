package springLes2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenerator.CLASSICAL);
        musicPlayer.playMusic(MusicGenerator.ROCK);
        musicPlayer.playMusic(MusicGenerator.POP);

//      Computer computer = context.getBean("computer", Computer.class);
//      System.out.println(computer);

        context.close();

    }
}

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("popMusic", PopMusic.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        musicPlayer2.playMusic();