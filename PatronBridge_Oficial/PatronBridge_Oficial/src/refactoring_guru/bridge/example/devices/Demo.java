package refactoring_guru.bridge.example.devices;

import refactoring_guru.bridge.example.devices.Device;
import refactoring_guru.bridge.example.devices.Radio;
import refactoring_guru.bridge.example.devices.Tv;
import refactoring_guru.bridge.example.devices.AdvancedRemote;
import refactoring_guru.bridge.example.devices.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv()); // Prueba con un televisor
        testDevice(new Radio()); // Prueba con una radio
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device); // Crea un control remoto básico y lo asocia con el dispositivo
        basicRemote.power(); // Enciende o apaga el dispositivo
        device.printStatus(); // Imprime el estado actual del dispositivo

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device); // Crea un control remoto avanzado y lo asocia con el dispositivo
        advancedRemote.power(); // Enciende o apaga el dispositivo
        advancedRemote.mute(); // Silencia el dispositivo
        device.printStatus(); // Imprime el estado actual del dispositivo
    }
}