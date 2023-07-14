package Patrones.State;

class AudioPlayer {
    // Clase AudioPlayer que utiliza los diferentes estados
    private State state;

    public AudioPlayer(){
        state = new StoppedState();
    }

    //cambia el estado para desencadenar otro evento
    public void changeState(State state){
        this.state = state;
    }

    public void pressPlay(){
        state.pressPlay(this);
    }

    public void pressPause(){
        state.pressPause(this);
    }

    public void pressStop(){
        state.pressStop(this);
    }
}
