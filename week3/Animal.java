package week3;
public class Animal extends LifeEntity {
  
    // atributes
 
  
    // constructor
  public Animal(String nameIn, int ageIn, double weightIn, double heightIn) {
    super(nameIn, ageIn, weightIn, heightIn);
  }
    // behaviours (methods)
    
     @Override
    public void speak() {
      System.out.println(" Animas speak deferently...");
    }
  }