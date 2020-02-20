package week4;

public abstract class Animal extends LifeEntity {
  
    // atributes
 
  
    // constructor
  public Animal(String nameIn, int ageIn, double weightIn, double heightIn) {
    super(nameIn, ageIn, weightIn, heightIn);
  }
    // behaviours (methods)
    
    
    public abstract void speak();
    public abstract LifeEntity mate(LifeEntity LivingThing);
    public  void eat(){
          System.out.println(" This creatre eats");
   
    }


  }