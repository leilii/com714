package week5;

public class Elephant extends Animal {

    public Elephant(String nameIn, int ageIn, double weightIn, double heightIn) {
        super(nameIn, ageIn, weightIn, heightIn);
    }

    @Override
    public void speak() {
        System.out.println("An Elephant says Oooo");
    }

    public void eat(LivingThing thing) {
        if (thing instanceof Plant) {
            System.out.println("Yummy plant!");
            setEnergy(getEnergy() + thing.getEnergy());
        } else {
            System.out.println("No thanks!");
        }
    }

}