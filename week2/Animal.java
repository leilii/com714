public class Animal {
  
    // atributes
    private int energy;
  
    // constructor
    public Animal() {
      energy = 10;
    }
  
    // behaviours (methods)
    public void eat(int amount) {
      energy = energy + amount;
    }
  
    public void speak() {
      System.out.println(" aah..");
    }
  }