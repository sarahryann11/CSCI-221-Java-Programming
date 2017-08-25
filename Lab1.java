package Lab1;

/**
 * @author Sarah Nicholson
 * @since September 5, 2016
 * @version 1
 * Java class that computes the area and circumference of a circle and prints the results.
 */

import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a radius value: ");
        
        double radius;
        double circumference;
        double area;
        
        Scanner keyboard = new Scanner(System.in);
        
        radius = keyboard.nextDouble( );
        
        if(radius > 0)
        {
            area = Math.PI * radius * radius;
            circumference = 2 * Math.PI * radius;
            System.out.println("The area is: " + area + "\n" + "The circumference is: " + circumference);
    }
    else
    {
        System.out.println("The entered radius is <= 0 ... Exiting Program");
}
}
}
