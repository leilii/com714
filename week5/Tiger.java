package week5;

public class Tiger extends Animal {

    public Tiger(String nameIn, int ageIn, double weightIn, double heightIn) {
        super(nameIn, ageIn, weightIn, heightIn);
    }

    @Override
    public void speak() {
        System.out.println("Roar!");
    }

    @Override
    public void mate(LifeEntity newanimal){
        if (newanimal instanceof Tiger)
           System.out.println("Yes the new animal is a tiger and can mate");
        else
          System.out.println("No thank you.."); 
    }

}