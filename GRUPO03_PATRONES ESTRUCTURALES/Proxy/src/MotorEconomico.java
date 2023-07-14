public class MotorEconomico extends Motor{
    public MotorEconomico(){
        super(); // Invoca a  la clase Motor
        System.out.println("Creando el motor comun");
    }
    @Override
    public void encender(){

        System.out.println("Encendiendo motor comun");
    }
    @Override
    public void acelerar()
    {
        System.out.println("Acelerando el motor común");
    }
    @Override
    public void apagar(){

        System.out.println("Apagando motor común");
    }
}
