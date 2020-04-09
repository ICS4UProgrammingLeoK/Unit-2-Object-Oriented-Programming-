public class Truck extends Vehicle{

    //variables
    public int numWheels;
    public int truckLength;

    //output for truck
    public String OutputInfoTruck(){
        String ouputinfotruck = "Truck:"+"\nPlate Number: " + Vehicle.plateNum + "\n Truck Colour: " + Vehicle.colour + "\n Doors: "+ Vehicle.doors +"\n Number of wheels: "+ numWheels +"\n Length: " + truckLength + "\n Speed: " + speed + "\n Max Speed: "+ maxSpeed;
        return ouputinfotruck;
    }
}