package Assignment2Employee;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(int CNIC, String firstName, String lastName, double wage, double hours) {
        super(CNIC, firstName, lastName);
        if (wage >= 0.0)
        {
            this.wage = wage;
        }

        if ((hours >= 0.0) || (hours <= 168.0))
        {
            this.hours = hours;
        }


    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0.0)
        {
            this.wage = wage;
        }

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours >= 0.0) || (hours <= 168.0))
        {
            this.hours = hours;
        }


    }
    // calculate earnings; override abstract method earnings in Employee

    public double earnings() {
        if (getHours() <= 40) { // no overtime
            return getWage() * getHours();
        }
        else
        {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }



    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Wage = " + wage + "\n" +
                "Hours = " + hours
                ;
    }
}