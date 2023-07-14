package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica;
        Objeto objeto;

        // Crear objeto utilizando la fábrica correspondiente
        fabrica = new FabricaLibro();
        objeto = fabrica.crearObjeto();
        System.out.println("Numero 1 " + objeto.descripcion());

        fabrica = new FabricaTesis();
        objeto = fabrica.crearObjeto();
        System.out.println("Fabrica Obejto: " + objeto.descripcion());

        fabrica = new FabricaArticulo();
        objeto = fabrica.crearObjeto();
        System.out.println("Fabrica Obejto: " + objeto.descripcion());
    }
}