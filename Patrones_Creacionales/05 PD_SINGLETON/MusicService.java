package PD_SINGLETON;

public class MusicService {
    // Singleton instance
    private static MusicService instance;

    // Instance variables
    private String currentSong;

    // Private constructor to prevent instantiation
    private MusicService() {
        currentSong = null;
    }

    // Method to get the singleton instance
    // un método static solo puede tener una implementación,
    // Static method to get the unique instance of the MusicService class
    public static MusicService getInstance() {
        if (instance == null) {
            instance = new MusicService();
        }
        return instance;
    }

    // Method to play a new song
    public void playSong(String song) {
        currentSong = song;
        System.out.println("Now playing: " + currentSong);
    }

    // Method to get the current song
    public String getCurrentSong() {
        return currentSong;
    }
}


