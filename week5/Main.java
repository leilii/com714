package week5;

public class Main {

    public static void main(String[] args) {
        Human firstPerson = new Human("Bobby", 8, 26, 26);
        firstPerson.speak();

        World theWorld = new World();
        theWorld.addLivingThing(firstPerson);

        Elephant elph1 = new Elephant("My Elephant",50, 50, 50);
        elph1.speak();

        SuperHuman superHero = new SuperHuman("Blah", 32, 23, 34);
        superHero.fly();

    }
}