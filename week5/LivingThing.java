
package week5;

public abstract class LivingThing {

    // attributes
    private String name;
    private int age;
    private double weight;
    private double height;
    private int energy;
    private static int nextId = 1;
    private int id;

    public LivingThing(String nameIn, int ageIn, double weightIn, double heightIn) {

        name = nameIn;
        age = ageIn;
        weight = weightIn;
        height = heightIn;
        energy = 100;
        id = nextId;
        nextId++;
    }

    // behaviours of entity

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEnergy() {
        return energy;
    }

    public double getWeight() {

        return weight;
    }

    public double getheight() {

        return height;
    }

    public int getId() {
        return id;
    }

    public void setEnergy(int amount) {
        if (amount > 100) {
            energy = 100;
        } 
        else {
            energy = amount;
        }
    }

}