import java.util.Objects;

public class Mammal extends Animal {
    private String environment;
    private int speed;


    public Mammal(String name, int age, String environment, int speed) {
        super(name, age);
        this.environment = ValidationUtils.validOrDefault(environment, "суша");
        if (speed <= 0) {
            this.speed = 10;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public void eat() {
        System.out.println("Млекопитающие кормят детенышей молоком матери");

    }

    @Override
    public void go() {
        System.out.println("Млекопитающие животные гуляют");

    }

    public String getEnvironment() {
            return environment;
        }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 10;
        } else {
            this.speed = speed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(environment, mammal.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }
}
