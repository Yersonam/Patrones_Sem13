// Cliente
class Auto {
    private Timon timon;
    private Chasis chasis;
    private Llantas llantas;

    public Auto(AbstractFactory factory) {
        timon = factory.createTimon();
        chasis = factory.createChasis();
        llantas = factory.createLlantas();
    }

    public void mostrarDescripcion() {
        System.out.println("Auto ensamblado con los siguientes componentes:");
        System.out.println("- " + timon.getDescription());
        System.out.println("- " + chasis.getDescription());
        System.out.println("- " + llantas.getDescription());
    }
}
