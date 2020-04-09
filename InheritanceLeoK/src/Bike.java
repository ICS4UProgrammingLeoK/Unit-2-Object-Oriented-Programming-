public class Bike extends Vehicle {
	//variables
    int numWheels = 2;
    public int numSeats = 1;

    //output for bike
    public String OutputInfoBike(){
        String outputinfobike= "Bike:"+ "\n Bike Colour: " + colour + "\n Number of wheels: "+ numWheels + "\n Number of seats: " + numSeats + "\n Speed: " + speed + "\n Max Speed: "+ maxSpeed;
        return outputinfobike;
    }
}