public class Vehicle {
	
    //variables with defaults
    public static String plateNum;
    public static String colour;
    public int doors;
    public static int speed = 0;
    public static int maxSpeed = 100;

    //calculates the speed
    public int EnteredSpeed() {return speed;}

    //calculates the max speed
    public int EnteredMaxSpeed() {
        return maxSpeed;
    }

    //output for car
    public String OutputInfoCar() {
        String outputinfocar = "Car:"+"\nPlate Number: " + plateNum + "\n Car Colour: " + colour + "\n Doors: "+ doors + "\n Speed: " + speed + "\n Max Speed: "+ maxSpeed;

        return outputinfocar;
    }

    //if user accelerates
    static protected void AccelerateCar() {
        //maxspeed increases
        maxSpeed += 10;
    }
    //if users brakes
    static protected void BrakeCar() {
        maxSpeed -= 10;
    }
}