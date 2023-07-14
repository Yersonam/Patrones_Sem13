package refactoring_guru.decorator.example.decorators;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Llamar al método writeData() del decorador padre y pasar los datos encriptados
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        // Llamar al método readData() del decorador padre y decodificar los datos
        return decode(super.readData());
    }

    private String encode(String data) {
        // Convertir la cadena en bytes
        byte[] result = data.getBytes();

        // Encriptar los bytes desplazando cada byte en 1
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }

        // Codificar los bytes en Base64 y devolver la cadena resultante
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        // Decodificar la cadena en Base64 en bytes
        byte[] result = Base64.getDecoder().decode(data);

        // Desencriptar los bytes desplazando cada byte en -1
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }

        // Convertir los bytes en una cadena y devolverla
        return new String(result);
    }
}

