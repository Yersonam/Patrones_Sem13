package refactoring_guru.bridge.example.devices;



    public class BasicRemote implements Remote {
        protected Device device; // Dispositivo que controla el control remoto

        public BasicRemote() {}

        public BasicRemote(Device device) {
            this.device = device; // Asigna el dispositivo que controlará el control remoto
        }

        @Override
        public void power() {
            System.out.println("Remote: power toggle"); // Mensaje indicando la acción del control remoto
            if (device.isEnabled()) { // Verifica si el dispositivo está encendido
                device.disable(); // Apaga el dispositivo
            } else {
                device.enable(); // Enciende el dispositivo
            }
        }

        @Override
        public void volumeDown() {
            System.out.println("Remote: volume down"); // Mensaje indicando la acción del control remoto
            device.setVolume(device.getVolume() - 10); // Reduce el volumen del dispositivo en 10 unidades
        }

        @Override
        public void volumeUp() {
            System.out.println("Remote: volume up"); // Mensaje indicando la acción del control remoto
            device.setVolume(device.getVolume() + 10); // Aumenta el volumen del dispositivo en 10 unidades
        }

        @Override
        public void channelDown() {
            System.out.println("Remote: channel down"); // Mensaje indicando la acción del control remoto
            device.setChannel(device.getChannel() - 1); // Reduce el canal del dispositivo en 1 unidad
        }

        @Override
        public void channelUp() {
            System.out.println("Remote: channel up"); // Mensaje indicando la acción del control remoto
            device.setChannel(device.getChannel() + 1); // Aumenta el canal del dispositivo en 1 unidad
        }
    }

