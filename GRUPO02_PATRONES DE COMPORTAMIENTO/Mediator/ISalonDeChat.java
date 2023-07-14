package Mediator;

public interface ISalonDeChat {
    public abstract void registra(Usuario participante);
    public abstract void enviar(String de, String a, String mensaje);
}


