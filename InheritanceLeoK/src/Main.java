/*
 * Created by Leo Kay
 * Created on April 8, 2020
 * Created for: ICS4U
 * Day #22 - Inheritance
 * This program uses a vehicle class along with inheritance for a truck and bike
 */
import java.util.*;
public class Main {
	
	//get a scanner
    static Scanner scanner = new Scanner(System.in);
    
    //get the classes
    static Vehicle vc = new Vehicle();
    static Bike bc = new Bike();
    static Truck tc = new Truck();

    public static void main(String[] args) {
        //variables
        String outputstuff;

        //get the mode of transportation
        System.out.println("Car, Truck or Bike?");

        //get input
        String choice = scanner.nextLine();

        //check the users choice
        if (choice.equals("Car") || choice.equals("car") || choice.equals("truck") || choice.equals("Truck")){
            //get plate number
            System.out.println("Plate Number: ");
            vc.plateNum = scanner.nextLine();

            //car or truck colour
            System.out.println("Vehicle Colour: ");
            vc.colour = scanner.nextLine();

            //get num of doors
            System.out.println("Number of Doors: ");
            vc.doors = Integer.parseInt(scanner.nextLine());

            //if the selected vehicle is  a truck
            if (choice.equals("Truck") || choice.equals("truck")){
            	//get num of wheels
                System.out.println("Number of Wheels: ");
                tc.numWheels = Integer.parseInt(scanner.nextLine());

                //get the length of the truck
                System.out.println("Length (m): ");
                tc.truckLength = Integer.parseInt(scanner.nextLine());
            }
        }
        //if it is a bike
        else if (choice.equals("Bike") || choice.equals("bike")){
        	//get the bike colour
        	System.out.println("Vehicle Colour: ");
        	bc.colour = scanner.nextLine();
        	vc.maxSpeed = 30;

        }

        //ask user for break or accelerate
        System.out.println("Accelerate (A) or Brake (B)?");

        //reads line
        String AorB = scanner.nextLine();

        //checks if the car speeds up or breaks
        if(AorB.equals("A") || AorB.equals("a")) {
        	Vehicle.AccelerateCar();
        }
        else if (AorB.equals("B") || AorB.equals("b")) {
            Vehicle.BrakeCar();
        }
            
        //gets vehicle output info
        if (choice.equals("Car") || choice.equals("car")) {
        	outputstuff = vc.OutputInfoCar();
        }
        else if (choice.equals("Truck") || choice.equals("truck")){
        	outputstuff = tc.OutputInfoTruck();
        }
        else {
        	outputstuff = bc.OutputInfoBike();
        }

        //print the info
        System.out.print(outputstuff);
    }
}