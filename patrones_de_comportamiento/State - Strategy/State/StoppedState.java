package Patrones.State;

public class StoppedState implements State{
    // Implementación concreta del estado "Detenido"
    @Override
    public void pressPlay(AudioPlayer audioPlayer) {
        System.out.println("Reproduciendo desde el principio");
        audioPlayer.changeState(new PlayingState());
    }

    @Override
    public void pressPause(AudioPlayer audioPlayer) {
        System.out.println("El reproductor no está reproduciendo");
    }

    @Override
    public void pressStop(AudioPlayer audioPlayer) {
        System.out.println("El reproductor ya está detenido");
    }
}
