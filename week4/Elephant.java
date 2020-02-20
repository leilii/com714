package week4;
public class Elephant extends Animal {

    @Override
    public void speak() {
        System.out.println("An Elephant says Oooo");
    }
        public void eat(int amount) {
          energy = energy + amount;
    }

}