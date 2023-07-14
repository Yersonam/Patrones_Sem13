package Patrones.State;

public class Main {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();

        //se llama a los métodos para simular la interacción con el reproductor de audio
        //en diferentes estados

        audioPlayer.pressPlay();
        audioPlayer.pressPause();
        audioPlayer.pressPlay();
        audioPlayer.pressStop();
        audioPlayer.pressPause();
        audioPlayer.pressStop();
        audioPlayer.pressPlay();
        audioPlayer.pressPause();
        audioPlayer.pressStop();
    }
}
