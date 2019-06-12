
package midtermexampartc;

import java.util.Scanner;

/**
 * The code to be used as the starting point for midterm exam 
 * Part C. Please add your name as a modifier before submitting
 * to the DropBox if you edit this file.
 * 
 * An application that allows a user to set up a route name
 * and a given distance and select some constraints for the route.
 * The program does not yet calculate the distance using constraints.
 * Do not worry about the functionality for the midterm. Just
 * the design.
 * @author dancye
 */
public class Mapz 
{

   
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Mapz!");
        Route userRoute = new Route();
        //create a new route
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance from the starting point in kms");
        int distance = sc.nextInt();
        userRoute.setDistance(distance);//set the distance
        
        //display the constraints and have the user select one:
        System.out.println("Select the corresponding constraint to add to your route");
        for(int i=0; i< userRoute.constraints.length; i++)
        {
            System.out.println(i+1 + ". " + userRoute.constraints[i]);
        }
        int constraintNum = sc.nextInt();
        //some code to calculate the increased or decreased route time
        //and display it will be added in version 2 (not on midterm)
        System.out.println("Calculating route time to: " + userRoute.getRouteName()+ "......");
        System.out.println("Check back after the midterm for route info!");
    }
    
}
