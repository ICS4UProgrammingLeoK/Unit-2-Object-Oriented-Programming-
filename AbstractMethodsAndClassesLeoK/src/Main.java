/*
 * Created by: Leo Kay
 * Created on: Apr 19th, 2020
 * Created for: ICS4U
 * Day #24 - Abstract Methods & Classes
 * This program uses abstract classes and methods for the vehicle program
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
        car car = new car();
        bike bike = new bike();
        
        //checks user input
        if (choice.equals("Bike") || choice.equals("bike")){
            //gets bike info
            System.out.println("Bike Colour:"); //colour
            bike.colour = scanner.nextLine(); 
            
            System.out.println("Number of Wheels:"); //num of wheels
            bike.numWheels = scanner.nextLine();
            
            //outputs bike info
            bike.info();
        }
        else if (choice.equals("Car") || choice.equals("car")){
            //gets car info
            System.out.println("Car Colour:"); //colour
            car.colour = scanner.nextLine();
            
            System.out.println("License Plate:"); //plate number
            car.plate = scanner.nextLine();
            
            System.out.println("Number of Doors:"); //num of doors
            car.doors = scanner.nextLine();
            
            System.out.println("Number of Wheels:"); //num of wheels
            car.numWheels = scanner.nextLine();
            
            //outputs info
            car.info();
        }
        else{
        	//if they enter something else than bike or car
            System.out.println("Please enter the proper information");
        }
    }
}

class bike extends Vehicle{
    @Override
    public void info() {
        //outputs bike info
        super.info();
        String outputinfo = "\nBike Colour: " + colour + "\nNumber of wheels: " + numWheels;
        System.out.println(outputinfo);
    }
}

class car extends Vehicle{
    @Override
    public void info() {
        //outputs car info
        super.info();
        String outputinfo = "\nLicense Plate : " + plate + "\nCar Colour : " + colour + "\nNumber of Doors : " + doors + "\nNumber of wheels: " + numWheels;
        System.out.println(outputinfo);
    }
}