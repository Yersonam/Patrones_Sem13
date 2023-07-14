package refactoring_guru.bridge.example.devices;

public class Tv implements Device {
    private boolean on = false; // Estado de encendido/apagado del televisor
    private int volume = 30; // Volumen actual del televisor (por defecto: 30%)
    private int channel = 1; // Canal actual del televisor (por defecto: 1)

    @Override
    public boolean isEnabled() {
        return on; // Devuelve el estado de encendido/apagado del televisor
    }

    @Override
    public void enable() {
        on = true; // Enciende el televisor
    }

    @Override
    public void disable() {
        on = false; // Apaga el televisor
    }

    @Override
    public int getVolume() {
        return volume; // Devuelve el volumen actual del televisor
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100; // Si el volumen es mayor a 100, se establece en 100 (máximo)
        } else if (volume < 0) {
            this.volume = 0; // Si el volumen es menor a 0, se establece en 0 (mínimo)
        } else {
            this.volume = volume; // Establece el volumen proporcionado
        }
    }

    @Override
    public int getChannel() {
        return channel; // Devuelve el canal actual del televisor
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel; // Establece el canal proporcionado
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set."); // Mensaje de identificación del televisor
        System.out.println("| I'm " + (on ? "enabled" : "disabled")); // Estado de encendido/apagado del televisor
        System.out.println("| Current volume is " + volume + "%"); // Volumen actual del televisor
        System.out.println("| Current channel is " + channel); // Canal actual del televisor
        System.out.println("------------------------------------\n");
    }
}