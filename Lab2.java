/**
 * Computes the heat index from user input. If the input is invalid, will print out a
 * messages saying that it cannot be computed. If the input is valid, will print out the
 * heat index along with the possible physical effects.
 * 
 * @author Sarah Nicholson
 * @since September 9, 2016
 * @version 1
 */

import java.util.Scanner;

public class Lab2
{
    public static void main(String[] args)
    {
        double temperature, humidity, heatIndex;
        
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Enter a temperature value (in Fahrenheit): ");
        temperature = keyboard.nextDouble( );
        
        System.out.println("Enter a humidity value (in percent, for example, 50 for 50%): ");
        humidity = keyboard.nextDouble( );
    
        if (temperature >= 80 && humidity >= 40)
        {
            heatIndex = (-42.379 + 2.04901523 * temperature + 10.14333127 * humidity - 0.22475541 * temperature * humidity - 6.83783e-3 * temperature * temperature - 5.481717e-2 * humidity * humidity + 1.22874e-3 * temperature * temperature * humidity + 8.5282e-4 * temperature * humidity * humidity - 1.99e-6 * temperature * temperature * humidity * humidity);
            if (heatIndex >= 80 && heatIndex < 90)
            {
                System.out.println("Caution: Fatigue is possible with prolonged exposure and activity.");
            }
            else if (heatIndex >= 90 && heatIndex < 105)
            {
                System.out.println("Extreme Caution: Sunstroke, heat cramps, and heat exhaustion are possible.");
            }
            else if (heatIndex >= 105 && heatIndex <= 130)
            {
                System.out.println("Danger: Sunstroke, heat cramps, and heat exhaustion likely; Heat stroke is possible.");
            }
            else 
            {
                System.out.println("Extreme Danger: Heat stroke or sunstroke likely with continued exposure.");
            }
        }
        else
        {
            System.out.println("Heat index cannot be computed.");
        }
    }
}
