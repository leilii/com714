package week4;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person("Bobby", 8, 26, 26);
        firstPerson.speak();

        World theWorld = new World();
        theWorld.addEntity(firstPerson);

        Elephant elph1 = new Elephant();
        elph1.speak();

        Hero superHero = new Hero();
        superHero.fly();

    }
}