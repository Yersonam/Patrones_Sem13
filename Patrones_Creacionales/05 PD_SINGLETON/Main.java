package PD_SINGLETON;

public class Main {
    public static void main(String [] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        user1.playSong("Song A");
        user1.getCurrentSong();
        user2.getCurrentSong();

        System.out.println("---------------------------------------------------");

        user2.playSong("Song B");
        user1.getCurrentSong();
        user2.getCurrentSong();
    }
}


