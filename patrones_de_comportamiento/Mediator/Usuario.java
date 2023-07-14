package Mediator;

public class Usuario implements IUsuarioChat{
    private String nombre;
    private SalonDeChat salon;

    public Usuario(SalonDeChat salon) {
        this.salon = salon;
    }

    @Override
    public void recibe(String de, String mensaje) {
        String S = " El usuario: "+de+" te dice: "+mensaje;
        System.out.println(nombre+";"+S);
    }
    @Override
    public void envia(String a, String mensaje) {

        salon.enviar(nombre,a,mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}
