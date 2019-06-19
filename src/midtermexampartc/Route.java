
package midtermexampartc;

import java.util.Scanner;

/**
 * A class to represent a very simplified route given to the Mapz class. A Route has name,
 *  a time (travel time), a distance, 
 * and some possible constraints (like toll_free, HOV lane and avoid_major_highways) 
 * In this simplified version we assume all routes start wherever you
 * are located when you ask Mapz for a travel time. Do not worry about
 * determining the starting location.
 * Some methods are not yet implemented but are used for design only.
 * @author dancye
 */
public class Route 
{
    public String name; //the name of the route, like "Rogers Centre"
    private int distance; //the distance from you in kms
    private int travelTime = 0;//time in minutes to get there driving an average of 60km/hr
    public  String[] constraints = {"toll free", "HOV lane", "avoid major highways"};
   

    /**
     * Constructor for route. Takes in the route's name and sets it
     */
    public Route()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the route name");
        String givenName = sc.nextLine();
        name = givenName;
    }
    
    /**
     * A method to get the route's name
     */
    public String getRouteName()
    {
        return name;
    }
    /**
     * A method that sets the route's distance away from the starting point
     * @param givenDistance 
     */
    public void setDistance(int givenDistance)
    {
        distance = givenDistance;
    }
    /**
     * A method that will save the user's profile 
     * to a database.
     */
    public void saveProfile()
    {
        //will be used to save user porfiles
    }
    
    public int getDistance()
    {
        return distance;
    }
    
    /**
     * Returns the travel time in minutes when you drive 60km/hr
     * If any of the constraints are selected, they are
     * applied here in later versions (i.e. do not worry about it on the midterm)
     * @return the travel time in minutes
     */
    public int getTravelTime()
    {
       travelTime = distance;//1km.minute
      
       return travelTime;//will be adjusted for constraints in future versions
    }

    
    /**
     * a method that will set up a user's profile name
     * @param givenUserName 
     */
    public void setUserName(String givenUserName)
    {
        //will be used to set up the user's account name
    }
    
    /**
     * A method that will set up a user's password
     * @param givenPass 
     */
    public void setUserPassword(String givenPass)
    {
        //will be used to set the user's password
        //information
    }
    
}
