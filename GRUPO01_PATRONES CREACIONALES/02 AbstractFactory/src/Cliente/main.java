package Cliente;

public class main {
    public static void main(String[] args) {
        cliente cliente1 = cliente.obtenerInstancia("cliente 1");
        System.out.println(cliente1.getNombre());

        cliente cliente2 = cliente.obtenerInstancia("cliente 2");
        System.out.println(cliente2.getNombre());

        System.out.println(cliente1 == cliente2);

    }
}
