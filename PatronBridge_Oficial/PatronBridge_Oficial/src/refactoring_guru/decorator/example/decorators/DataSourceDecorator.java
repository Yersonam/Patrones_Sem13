package refactoring_guru.decorator.example.decorators;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        // Llamar al método writeData() del objeto wrappee
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        // Llamar al método readData() del objeto wrappee y devolver el resultado
        return wrappee.readData();
    }
}