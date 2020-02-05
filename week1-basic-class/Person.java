//entity

public class Person {
   //atributes of entity
      // premitive data types starts with lowerCase
     private String name;
     private int age;
     private double weight;
     private double height;
    //Constractor
     public Person(){
     name="Leila";
     age=41;
     weight=58.05;
     height= 160.00;
}
public Person (String nameIn, int ageIn, double weightIn, double heightIn){
      name=nameIn;
      age=ageIn;
      weight=weightIn;
      height=heightIn;
}
   //behaviours of entity
  //public access modify
    public void eat (double amount){
      weight=weight+amount;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){

        return weight;
    }
    public double getheight(){

        return height;
    }

    public void grow (double amount){

        height= height+amount;
    }
     
    public  static void main(String[] args) {
        System.out.println("Hey This is Person class!");
}
}