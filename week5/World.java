package week5;

import java.util.ArrayList;

public class World {

  // attributes
  // private ArrayList<Person> people;
  // private ArrayList<Animal> animals;
  // change using polimorphisim

  private ArrayList<LivingThing> livingThings;

  // constructor

  public World() {

    // people =new ArrayList<Person>();
    // animals= new ArrayList<Animal>();
    livingThings = new ArrayList<LivingThing>();
  }

  /*
   * public void addPerson(Person personIn){ people.add(personIn); } public void
   * addAnimal Animal (animalIn)
   */
  public LivingThing findLivingThiong(int id) {
    for (LivingThing thing : livingThings) {
      if (thing.getId() == id) {
        return thing;
      }
    }
    return null;
  }

  public void removeLivingThing(int id) {
    LivingThing removingThing = findLivingThing(id);
    livingThings.remove(removingThing);
  }

  public void addLivingThing(LivingThing thing) {
    livingThings.add(thing);
  }
}
