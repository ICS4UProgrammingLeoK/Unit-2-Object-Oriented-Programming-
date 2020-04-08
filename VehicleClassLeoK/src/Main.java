/*
 * Created by: Leo Kay
 * Created on: April 6, 2020
 * Created for: ICS4U
 * Day #20 - Vehicle Class
 * This program uses a class to create vehicles
 */
import java.util.*;
public class Main {


    static Scanner scanner = new Scanner(System.in);

    static Vehicle vc = new Vehicle();

    public static void main(String[] args) {
        //variables
        String outputstuff;

        //car plate
        System.out.println("Plate Number: ");
        vc.plateNum = scanner.nextLine();

        //car colour
        System.out.println("Vehicle Colour: ");
        vc.colour = scanner.nextLine();

        //car doors
        System.out.println("Number of Doors: ");
        vc.doors = Integer.parseInt(scanner.nextLine());

        //asks user if the vehicle breaks or accelerates
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
        
        //display the information
        outputstuff = vc.OutputInfoCar();
        System.out.print(outputstuff);
    }
}
    