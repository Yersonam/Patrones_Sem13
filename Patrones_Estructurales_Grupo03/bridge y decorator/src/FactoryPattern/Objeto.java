package FactoryPattern;

// Definición de la interfaz base
interface Objeto {
    String descripcion(); // Método para obtener la descripción del objeto
}

// Clase Libro que implementa la interfaz Objeto
class Libro implements Objeto {
    public String descripcion() {
        return "Libro"; // Retorna la descripción
    }
}

// Clase Tesis que implementa la interfaz Objeto
class Tesis implements Objeto {
    public String descripcion() {
        return "Tesis"; // Retorna la descripción
    }
}

// Clase Articulo que implementa la interfaz Objeto
class Articulo implements Objeto {
    public String descripcion() {
        return "Articulo"; // Retorna la descripción
    }
}