
/**
 * The class DoctorTest tests the methods in the class Doctor.
 * 
 * @author Sarah Nicholson
 * @date 10/31/16
 */
public class DoctorTest
{
    public static void main (String [] args)
    {
        Doctor x = new Doctor("Seuss", "Pediatrics");
        Doctor y = new Doctor("Seuss", "Pediatrics");
        Doctor z = new Doctor("Seuss", null);
        System.out.println(x.getName());
        System.out.println(x.getSpecialty());
        
        System.out.println();
        
        System.out.println("Is x equal to y: " + x.equals(y));
        x.display();
        
        System.out.println();
        
        x.setSpecialty("Not Pediatrics");
        x.setName("Not Seuss");
        System.out.println(x.getName());
        System.out.println(x.getSpecialty());
        System.out.println("Is x equal to y now: " + x.equals(y));
        x.display();
        
        System.out.println();
        y.display();
        System.out.println();
        System.out.println(z.getSpecialty());
        z.display();
    }
}
