public class Main {
    public static void main(String[] args) {
        Amphibian frog = new Amphibian("Лягушка", 5, "лес");
        Amphibian adder = new Amphibian("Уж пресноводный", 1, "берег пруда");

        System.out.println(frog);
        System.out.println(adder);
        frog.eat();

        Herbivore gazelle = new Herbivore("Газель", 0, "саванна", 60, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 2, "саванна", 15, "листья деревьев");
        Herbivore horse = new Herbivore("Лошадь", 7, "равнина", 40, "сено и трава");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        horse.eat();

        Carnivore hyena = new Carnivore("Гиена", 6, "пустыня", 25, "падаль");
        Carnivore tiger = new Carnivore("Тигр", 7, "джунгли", 50, null);
        Carnivore bear = new Carnivore("Медведь", 15, "лес", 10, "мясо и мед");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        bear.eat();

        Nonflying peacock = new Nonflying("Павлин", 4, "джунгли", "гуляет");
        Nonflying penguin = new Nonflying("Пингвин", 2,"Антарктика", null);
        Nonflying dodo = new Nonflying("Птица додо", 1, null, "гуляет");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        peacock.go();

        Flying seagull = new Flying("Чайка", 3, "морской берег", "летает");
        Flying albatross = new Flying("Альбатрос", 4, null, null);
        Flying falcon = new Flying("Сокол", 1, "лес", "летает");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

        falcon.go();

    }
}


