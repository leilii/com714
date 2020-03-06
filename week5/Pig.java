// Subclass (inherit from Animal)
package week5;

public class Pig extends Animal {

  public Pig(String nameIn, int ageIn, double weightIn, double heightIn) {
    super(nameIn, ageIn, weightIn, heightIn);
  }

  @Override
  public void speak() {

    System.out.println("The pig says: wee wee");
  }
}