package week4;
public class Hero extends Person implements Flyer {

    @Override
    public void fly(){
           system.out.println("I am a human who can flies...");
    }

}