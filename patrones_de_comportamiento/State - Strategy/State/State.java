package Patrones.State;

interface State {
    // Interfaz State que define los métodos comunes para todos los estados
    void pressPlay(AudioPlayer audioPlayer);
    void pressPause(AudioPlayer audioPlayer);
    void pressStop(AudioPlayer audioPlayer);
}
