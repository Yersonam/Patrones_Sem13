import java.util.List;
import java.util.Random;

public class Developer implements Employee {

    String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Employee e) {
        // nothing to implement
    }

    @Override
    public int calculatePoints() {
        return new Random().nextInt(24);
    }

    @Override
    public String toString() {
        return "Yo soy " + getName() + ", Desarrollador";
    }

}