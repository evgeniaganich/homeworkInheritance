import java.util.Objects;

public class Bird extends Animal {
    private String environment;

    public Bird(String name, int age, String environment) {
        super(name, age);
        this.environment = ValidationUtils.validOrDefault(environment, "воздух");
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {
        System.out.println("Птицы охотятся");
    }

    public String getEnvironment() {
        return environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(environment, bird.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }
}
