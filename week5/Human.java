//entity
package week5;

public class Human extends Animal {
    // attributes

    // constractor
    public Human(String nameIn, int ageIn, double weightIn, double heightIn) {
        super(nameIn, ageIn, weightIn, heightIn);
    }

    // behaviours
    @Override
    public void speak() {
        System.out.println("I am human speaking!");
    }

    @Override
    public void mate(LifeEntity partner) {
        if (partner instanceof Person) {
            System.out.println("Okay to mate");
        } else {
            System.out.println("No thanks");
        }
    }
}