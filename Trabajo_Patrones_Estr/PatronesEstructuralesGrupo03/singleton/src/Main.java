public class Main {
    public static void main(String[] args) {
        // Obtiene la instancia única de Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.imprimir();//Datos de un metodo
        // Accede a los datos de la instancia
        String data = singleton.getData();
        System.out.println("\n"+data);//Datos de un constructor
    }
}
