/*
 * Created by: Leo Kay
 * Created on: April 20, 2020
 * Created for: ICS4U
 * Day #23 - Polymorphism
 * This program uses polymorphism for the vehicle class
 */

import java.util.Scanner;

public class Main {
	//scanner
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//variables
        System.out.println("Bike or Car?");
        String choice = scanner.nextLine();

        //classes
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();
        
        //checks user input
        if (choice.equals("Bike") || choice.equals("bike")){
            //gets bike info
            System.out.println("Bike Colour:"); //colour
            bike.colour = scanner.nextLine(); 
            
            System.out.println("Number of Wheels:"); //num of wheels
            bike.numWheels = Integer.parseInt(scanner.nextLine());
            
            //outputs bike info
            bike.info(1);
        }
        else if (choice.equals("Car") || choice.equals("car")){
            //gets car info
            System.out.println("Car Colour:"); //colour
            car.colour = scanner.nextLine();
            
            System.out.println("License Plate:"); //plate number
            car.plate = scanner.nextLine();
            
            //outputs info
            car.info(4, 4);
        }
        else{
        	//if they enter something else than bike or car
            System.out.println("Please enter the proper information");
        }
    }
	/*
	class car extends Vehicle{
		@Override
		public void info(int carDoors, int carWheels) {
			String outputinfo = "\nLicense Plate : " + plate + "\nCar Colour : " + colour + "\nNumber of Doors : " + doors + "\nNumber of wheels: " + numWheels;
	        System.out.println(outputinfo);
		}
		
	}
	
	class bike extends Vehicle{
		@Override
		public void info(int seats) {
			String outputinfo = "\nCar Colour : " + colour + "\nNumber of seats : " + seats + "\nNumber of wheels: " + numWheels;
	        System.out.println(outputinfo);
		}
	}
	*/
}
