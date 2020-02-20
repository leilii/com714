
package week4;

public abstract class  LifeEntity {

    // attributes
    private String name;
    private int age;
    private double weight;
    private double height;
    private int energy;

    public LifeEntity(String nameIn, int ageIn, double weightIn, double heightIn) {
        name = nameIn;
        age = ageIn;
        weight = weightIn;
        height = heightIn;
        energy = 100;
    }

    // behaviours of entity

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {

        return weight;
    }

    public double getheight() {

        return height;
    }
   



}