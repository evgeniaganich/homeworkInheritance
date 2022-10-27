import java.util.Objects;

public class Herbivore extends Mammal {
    private String foodType;

    public Herbivore(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);
        this.foodType = ValidationUtils.validOrDefault(foodType, "листья");
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat() {
        System.out.println("Травоядные животные пасутся");
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
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(foodType, herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return "Класс: млекопитающие, отряд: травоядные, животное: " + getName() + ", возраст (полных лет): " + getAge() +
                ", среда обитания: " + getEnvironment() + ", скорость: " + getSpeed() + " км/ч, тип пищи: " + foodType;
    }
}
