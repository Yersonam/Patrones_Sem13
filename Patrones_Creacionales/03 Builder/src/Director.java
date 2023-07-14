public class Director {
    public void construirTelefonoMovil(Builder builder) {
        builder.setMarca("Samsung");
        builder.setModelo("Galaxy S23");
        builder.setCapacidad("256GB");
        builder.setTamanioPantalla(6.1);
    }

    public void construirTelefonoMovilPlus(Builder builder) {
        builder.setMarca("Samsung");
        builder.setModelo("Galaxy S23+");
        builder.setCapacidad("512GB");
        builder.setTamanioPantalla(6.6);
    }

    public void construirTelefonoMovilUltra(Builder builder) {
        builder.setMarca("Samsung");
        builder.setModelo("Galaxy S23 Ultra");
        builder.setCapacidad("1TB");
        builder.setTamanioPantalla(6.8);
    }
}