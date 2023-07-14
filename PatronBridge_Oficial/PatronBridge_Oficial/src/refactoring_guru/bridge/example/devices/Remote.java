package refactoring_guru.bridge.example.devices;


public interface Remote {
    void power(); // Método para encender o apagar el dispositivo controlado por el control remoto.

    void volumeDown(); // Método para disminuir el volumen del dispositivo controlado por el control remoto.

    void volumeUp(); // Método para aumentar el volumen del dispositivo controlado por el control remoto.

    void channelDown(); // Método para disminuir el canal del dispositivo controlado por el control remoto.

    void channelUp(); // Método para aumentar el canal del dispositivo controlado por el control remoto.
}