package Mediator;

import java.util.HashMap;

public class SalonDeChat implements ISalonDeChat{
    private HashMap<String, Usuario> Participantes = new HashMap<String, Usuario>();
    @Override
    public void registra(Usuario user) {

        Participantes.put(user.getNombre(), user);
    }

    @Override
    public void enviar(String de, String a, String mensaje) {
        if (Participantes.containsKey(de) && Participantes.containsKey(a)){
                Usuario u = Participantes.get(a);
                u.recibe(de, mensaje);
        }
        else {
            System.out.println("No existe el usuario");
        }
    }
}
