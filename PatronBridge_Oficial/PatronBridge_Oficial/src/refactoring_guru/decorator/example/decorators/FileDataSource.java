package refactoring_guru.decorator.example.decorators;

import java.io.*;

public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        // Crear un objeto File con el nombre proporcionado
        File file = new File(name);

        try (OutputStream fos = new FileOutputStream(file)) {
            // Escribir los datos en el archivo utilizando un FileOutputStream
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            // Manejar cualquier excepción de IO que pueda ocurrir
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)) {
            // Leer los datos del archivo utilizando un FileReader
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            // Manejar cualquier excepción de IO que pueda ocurrir
            System.out.println(ex.getMessage());
        }

        // Convertir el arreglo de caracteres en una cadena y devolverlo
        return new String(buffer);
    }
}