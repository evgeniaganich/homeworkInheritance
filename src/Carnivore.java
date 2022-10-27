import java.util.Objects;

public class Carnivore extends Mammal {
    private String foodType;

    public Carnivore(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        this.foodType = ValidationUtils.validOrDefault(foodType, "мясо");
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat() {
        System.out.println("Хищные животные охотятся");
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivore carnivore = (Carnivore) o;
        return Objects.equals(foodType, carnivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Класс: млекопитающие, отряд: хищники, животное: " + getName() + ", возраст (полных лет): " + getAge() +
                ", среда обитания: " + getEnvironment() + ", скорость: " + getSpeed() + " км/ч, тип пищи: " + foodType;
    }
}
