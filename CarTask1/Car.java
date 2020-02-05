public class Car {
    private int modelYear;
    private String brandName;
    private String modelName;
    private double currentSpeed;
    private double maxSpeed;
    private double fuelLevel;


 /*   public Car(int year, String bName, String mName,double cSpeed,double mSpeed, double fLevel ) {
      modelYear = year;
      brandName =bName;
      modelName = mName;
      currentSpeed = cSpeed;
      maxSpeed = mSpeed;
      fuelLevel=fLevel;

    }
*/
          /*
           Encapsulation (access using get and set methods) is for:
                Better control of class attributes and methods
                Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
                Flexible: the programmer can change one part of the code without affecting other parts
                Increased security of data
          */

    //Task 1.2 - Getter Methods
       public int getmodelYear(){
        return modelYear;
       } 
       public String getbrandName(){
        return brandName;
       }  
       public String getmodelName(){
        return modelName;
       } 
       public double getcurrentSpeed(){
        return currentSpeed;
       } 
       public double getmaxSpeed(){
        return maxSpeed;
       }  
       public double getfuelLevel(){
        return fuelLevel;
       }
    //Task 1.3 - Setter Methods
       public void setmodelYear(int modelYear){
        this.modelYear=modelYear;
       } 
       public void setbrandName(String brandName){
        this.brandName=brandName;
       }  
       public void setmodelName(String modelName){
        this.modelName=modelName;
       } 
       public void setcurrentSpeed(double currentSpeed){
        this.currentSpeed=currentSpeed;
       } 
       public void setmaxSpeed(double maxSpeed){
        this.maxSpeed=maxSpeed;
       }  
       public void setfuelLevel(double fuelLevel){
        this.fuelLevel=fuelLevel;
       }
     //Task 1.4 - Methods
       public void accelerate(){
           this.currentSpeed++;
           this.fuelLevel--;
       } 

    

    public  static void main(String[] args) {
          
         // Create Car objects
           Car yourCar = new Car();
        // Assign them values using the setter methods
            yourCar.setmodelYear(2010);
            yourCar.setbrandName("Bentley");
            yourCar.setmodelName("Continental");
            yourCar.setcurrentSpeed(12.50);
            yourCar.setmaxSpeed(35.33);
            yourCar.setfuelLevel(10.10);
          /* Car myCar= new Car(2010,"Vaxhal","Astra",20.33,20.00,12.12);
           Car FirstCar= new Car(2008,"BMW","X3",10.00,40.00,15.00);8
      
           System.out.println("My Car is a: "+myCar.modelYear + " " + myCar.brandName +"  "+ myCar.modelName+" "+myCar.maxSpeed);
           */
           System.out.println("Your Car is a: ");
           System.out.println(yourCar.getbrandName());
           System.out.println(yourCar.modelYear + " " + yourCar.modelName+" "+yourCar.currentSpeed+" "+yourCar.maxSpeed+" "+yourCar.fuelLevel);
           yourCar.accelerate();
           System.out.println(yourCar.getcurrentSpeed());
           System.out.println(yourCar.getfuelLevel());
          
    }
}
