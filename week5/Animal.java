package week5;

public abstract class Animal extends LivingThing {

  // atributes

  // constructor
  public Animal(String nameIn, int ageIn, double weightIn, double heightIn) {
    super(nameIn, ageIn, weightIn, heightIn);
  }
  // behaviours (methods)

  public abstract void speak();

  public abstract LivingThing mate(LivingThing thing);

  public abstract void eat(LivingThing thing);

}