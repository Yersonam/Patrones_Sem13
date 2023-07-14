package refactoring_guru.bridge.example.devices;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super.device = device; // Asigna el dispositivo que controlará el control remoto avanzado
    }

    public void mute() {
        System.out.println("Remote: mute"); // Mensaje indicando la acción del control remoto
        device.setVolume(0); // Establece el volumen del dispositivo en 0 (silencio)
    }
}
