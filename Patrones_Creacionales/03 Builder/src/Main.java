public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Director obtiene el objeto constructor específico del fabricante.
        // Esto se debe a que la aplicación sabe qué constructor debe usar
        // para obtener un teléfono específico.
        TelefonoMovilBuilder builder = new TelefonoMovilBuilder();
        director.construirTelefonoMovil(builder);

        // El teléfono final frecuentemente se recupera de un objeto constructor,
        // ya que Director no es consciente ni depende de constructores y productos en específico.
        TelefonoMovil telefonoMovil = builder.getResultado();
        System.out.println("Teléfono:\n" + telefonoMovil.getMarca() + " " + telefonoMovil.getModelo());


        ManualTelefonoBuilder manualBuilder = new ManualTelefonoBuilder();

        // El director puede conocer varias recetas de construcción.
        director.construirTelefonoMovil(manualBuilder);
        Manual manualTelefono = manualBuilder.getResultado();
        System.out.println("\nManual del teléfono:\n" + manualTelefono.imprimirManual());


        TelefonoMovilBuilder builderUltra = new TelefonoMovilBuilder();
        director.construirTelefonoMovilUltra(builderUltra);

        TelefonoMovil telefonoMovilUltra = builderUltra.getResultado();
        System.out.println("Teléfono:\n" + telefonoMovilUltra.getMarca() + " " + telefonoMovilUltra.getModelo());

        ManualTelefonoBuilder manualBuilderUltra = new ManualTelefonoBuilder();

        director.construirTelefonoMovilUltra(manualBuilderUltra);
        Manual telefonoManualUltra = manualBuilderUltra.getResultado();
        System.out.println("\nManual del teléfono:\n" + telefonoManualUltra.imprimirManual());


    }
}