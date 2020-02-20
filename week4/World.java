import com.sun.xml.internal.stream.Entity;

public class World {
  // attributes
  // private ArrayList<Person> people;
  // private ArrayList<Animal> animals;
  // change using polimorphisim

  private ArrayList<LifeEntity> entities;

  // constructor

  public World() {

    // people =new ArrayList<Person>();
    // animals= new ArrayList<Animal>();
    entities = new ArrayList<LifeEntity>();
  }

  /*
   * public void addPerson(Person personIn){ people.add(personIn); } public void
   * addAnimal Animal (animalIn)
   */
  public void addEntity(LifeEntity entityIn) {
    entities.add(entityIn);
  }
}
