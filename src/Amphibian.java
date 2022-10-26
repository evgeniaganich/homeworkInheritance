import java.util.Objects;

public class Amphibian extends Animal {
    private String environment;

    public Amphibian(String name, int age, String environment) {
        super(name, age);
        this.environment = ValidationUtils.validOrDefault(environment, "суша и вода");
    }

    @Override
    public void eat() {
        System.out.println("Земноводные животные охотятся");

    }

    @Override
    public void go() {

    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public String toString() {
        return "Класс: земноводные, животное: " + getName() + ", возраст (полных лет): " + getAge() +
                ", среда обитания: " + environment;
    }



}
