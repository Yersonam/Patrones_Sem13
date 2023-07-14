package Ejemplo_02;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del proxy remoto
        RemoteService remoteService = new RemoteServiceProxy();

        // Realizar la solicitud a través del proxy
        remoteService.request();
    }
}
