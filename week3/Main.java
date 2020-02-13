public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person("Bobby", 8, 25, 25);
        firstPerson.speak();

        World theWorld = new World();
        theWorld.addEntity(firstPerson);

    }
}