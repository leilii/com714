package week5;
public class SuperHuman extends Human implements Flyer, Vanisher {

    public SuperHuman(String nameIn, int ageIn, double weightIn, double heightIn) {
        super(nameIn, ageIn, weightIn, heightIn);
    }

    @Override
    public void fly(){
           System.out.println("I am a human who can flies...");
    }

    @Override
    public void vanish(Boolean isInvisible){
        if (isInvisible) {
           System.out.println("I have turned invisible!");
        }
        else {
            System.out.println("You can see me again!");
        }
    }

}