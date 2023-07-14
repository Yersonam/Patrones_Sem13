package PD_SINGLETON;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void playSong(String song) {
        MusicService.getInstance().playSong(song);
    }

    public void getCurrentSong() {
        System.out.println(name + " is listening to: " + MusicService.getInstance().getCurrentSong());
    }
}


