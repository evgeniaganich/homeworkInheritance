import java.util.Objects;

public class Flying extends Bird{
    public String moveType;

    public Flying(String name, int age, String environment, String moveType) {
        super(name, age, environment);
        this.moveType = ValidationUtils.validOrDefault(moveType, "летает");
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
        System.out.println("Летающие птицы летают");
    }
    @Override
    public String toString() {
        return "Класс: птицы, подвид: летающие, животное: " + getName() + ", возраст (полных лет): " + getAge() +
                ", среда обитания: " + getEnvironment() + ", тип передвижения: " + moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(moveType, flying.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }
}
