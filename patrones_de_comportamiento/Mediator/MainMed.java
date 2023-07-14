package Mediator;

public class MainMed {
        public static void main(String[] args) {

            SalonDeChat s = new SalonDeChat();
            Usuario u = new Usuario(s);
            u.setNombre("Juan");
            s.registra(u);

            Usuario u1 = new Usuario(s);
            u1.setNombre("Paul");
            s.registra(u1);

            Usuario u2 = new Usuario(s);
            u2.setNombre("Raul");
            s.registra(u2);

            u.envia("Paul","Hola como estas");
            u1.envia("Juan","Todo bien ¿y tu?");
            u2.envia("Paul","¿Martin esta?");
        }
}
