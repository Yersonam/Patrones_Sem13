package FactoryPattern;

// Definición de la interfaz Factory
interface Fabrica {
    Objeto crearObjeto(); // Método para crear un objeto de la interfaz Objeto
}

// Clase concreta de la fábrica para crear objetos de tipo Libro
class FabricaLibro implements Fabrica {
    public Objeto crearObjeto() {
        return new Libro(); // Crea y devuelve un objeto de tipo Libro
    }
}

// Clase concreta de la fábrica para crear objetos de tipo Tesis
class FabricaTesis implements Fabrica {
    public Objeto crearObjeto() {
        return new Tesis(); // Crea y devuelve un objeto de tipo Tesis
    }
}

// Clase concreta de la fábrica para crear objetos de tipo Articulo
class FabricaArticulo implements Fabrica {
    public Objeto crearObjeto() {
        return new Articulo(); // Crea y devuelve un objeto de tipo Articulo
    }
}