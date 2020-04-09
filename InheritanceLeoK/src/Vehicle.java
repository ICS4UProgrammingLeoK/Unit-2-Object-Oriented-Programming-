public class Vehicle {
	
    //variables
    public static String plateNum;
    public static String colour;
    public static int doors;
    public static int speed = 0;
    public static int maxSpeed = 100;

    //speed
    public int EnteredSpeed() {return speed;}

    //maxSpeed
    public int EnteredMaxSpeed() {return maxSpeed;}

    //output for car
    public String OutputInfoCar() {
        String outputinfocar="Car:"+"\nPlate Number: " + plateNum + "\n Car Colour: " + colour + "\n Doors: "+ doors + "\n Speed: " + speed + "\n Max Speed: "+ maxSpeed;
        return outputinfocar;
    }

    //if user accelerates
    static protected void AccelerateCar() {
        //maxSpeed increases
        maxSpeed += 10;
    }
    //if users brakes
    static protected void BrakeCar() {
    	//maxSpeed decreases
        maxSpeed -= 10;
    }





}