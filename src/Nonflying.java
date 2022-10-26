import java.util.Objects;

public class Nonflying extends Bird{
    public String moveType;

    public Nonflying(String name, int age, String environment, String moveType) {
        super(name, age, environment);
        this.moveType = ValidationUtils.validOrDefault(moveType, "гуляет");
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void go() {
        System.out.println("Нелетающие птицы гуляют");
    }
    @Override
    public String toString() {
        return "Класс: птицы, подвид: нелетающие, животное: " + getName() + ", возраст (полных лет): " + getAge() +
                ", среда обитания: " + getEnvironment() + ", тип передвижения: " + moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nonflying nonflying = (Nonflying) o;
        return Objects.equals(moveType, nonflying.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
