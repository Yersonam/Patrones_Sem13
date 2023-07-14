package Chain_Responsability.src;

import Chain_Responsability.src.*;
public class App {
    public static void main(String[] args) {
        // Creamos los aprobadores
        Aprobador junior = new AprobadorJunior();
        Aprobador senior = new AprobadorSenior();

        // Configuramos la cadena de responsabilidad
        junior.setSiguiente(senior);

        // Creamos una solicitud
        Solicitud solicitud = new Solicitud(2000);

        // Procesamos la solicitud
        junior.procesarSolicitud(solicitud);
    }
}
