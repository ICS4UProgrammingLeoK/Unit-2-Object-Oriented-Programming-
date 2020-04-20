public class Vehicle {
	//variables
	public static String plate;
    public static String colour;
    public static int numWheels;

	public void info(int carDoors, int carWheels) {
		// TODO Auto-generated method stub
		String outputinfo = "\nLicense Plate : " + plate + "\nCar Colour : " + colour + "\nNumber of Doors : " + carDoors + "\nNumber of wheels: " + carWheels;
        System.out.println(outputinfo);
	}

	public void info(int seats) {
		// TODO Auto-generated method stub
		String outputinfo = "\nCar Colour : " + colour + "\nNumber of seats : " + seats + "\nNumber of wheels: " + numWheels;
        System.out.println(outputinfo);
	}
}