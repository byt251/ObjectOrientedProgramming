package carGame;

/**
 * Created by User on 11/21/2017.
 */

public class Car {
    public String color;
    public int horsePower;
    public double engineSize;
    public String make;
    private static int count = 0;


    public Car() {
        make = "Toyota";
        color = "White";
        engineSize = 4.5;
        horsePower = 500;
        count++;}

    public Car(String make, String color, double engineSize, int horsePower) {
        this.make = make;
        this.color = color;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        count++;

    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setHorsePower(int horsePower){
        this.horsePower=horsePower;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setEngineSize(double engineSize){
        this.engineSize=engineSize;
    }
    public double getEngineSize(){
        return engineSize;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public static int getCount() {
        return count;}


    private boolean equals(Car obj) {
        boolean status = false;
        status = this.getColor().equals(obj.getColor()) && this.getEngineSize() == obj.getEngineSize() &&
                this.getHorsePower() == obj.getHorsePower()&& this.getMake()== obj.getMake();
        return status;
    }
}
