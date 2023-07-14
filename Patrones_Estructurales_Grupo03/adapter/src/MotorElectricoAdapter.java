public class MotorElectricoAdapter extends Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico(); //El objeto actual tendrá una propiedad llamada motorElectrico que hace referencia a la instancia creada de MotorElectrico.0
        System.out.println("Creando motor Electrico adapter");
    }
    @Override
    public void encender(){
        System.out.println("Encendiendo motorElectricoAdapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico...");
        this.motorElectrico.moverMasRapido(); //Llama al método movermasrapido definido en la clase motorElectrico.
    }
    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
