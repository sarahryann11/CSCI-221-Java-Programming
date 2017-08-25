
/**
 * This Doctor class extends the Person class and stores and changes information for doctors.
 * 
 * @author Sarah Nicholson 
 * @date 10/31/16
 */
public class Doctor extends Person
{
    private String specialty;
    public Doctor (String name, String mSpecialty)
    {
        super(name);
        setSpecialty(mSpecialty);
    }
    public String getSpecialty()
    {
        return this.specialty;
    }
    public void setSpecialty(String mSpecialty)
    {
        if (mSpecialty != null)
        {
            this.specialty = mSpecialty;
        }
        else
        {
            this.specialty = "unknown";
        }
    }
    public void display()
    {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Doctor Specialty: " + specialty);
    }
    public boolean equals(Doctor otherDoctor)
    {
        return equals((Person)(otherDoctor)) && otherDoctor.getSpecialty().equalsIgnoreCase(getSpecialty());
    }
}
