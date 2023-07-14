package Ejemplo_02;

public class RemoteServiceProxy implements RemoteService {
    private RemoteService remoteService;

    public RemoteServiceProxy() {
        // Aquí podrías inicializar el objeto remoto de manera diferida o a través de una conexión remota
        // Por simplicidad, en este ejemplo se instancia directamente el objeto remoto
        remoteService = new RemoteServiceImpl();
    }
    public void request() {
        // Realizar operaciones adicionales antes de llamar al objeto remoto
        System.out.println("Realizando tareas previas...");

        // Llamar al objeto remoto a través del proxy
        remoteService.request();

        // Realizar operaciones adicionales después de llamar al objeto remoto
        System.out.println("Realizando tareas posteriores...");
    }
}
