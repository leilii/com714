public class Tiger extends Animal {

    @Override
    public void speak(){
        System.out.println("Roar!");
    }
    @Override
    public void mate(LifeEntity newanimal){
        if (newanimal instanceof Tiger)
           System.out.println("Yes the new animal is a tiger and can mate");
        else
          System.out.println("No thank you..")  
    }

}