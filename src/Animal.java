import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = ValidationUtils.validOrDefault(name, "Животное");
        if (age < 0) {
            this.age = 5;
        } else {
            this.age = age;
        }
    }
    public abstract void eat();
    public void sleep() {

    }
    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "Животное");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 5;
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Животное: " + name + ", возраст: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
