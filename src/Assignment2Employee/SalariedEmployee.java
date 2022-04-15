package Assignment2Employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(int CNIC, String firstName, String lastName, double weeklySalary) {
        super(CNIC, firstName, lastName);
        if (weeklySalary >= 0.0)
        {
            this.weeklySalary = weeklySalary;
        }
        else
            this.weeklySalary = 0;

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0.0)
        {
            this.weeklySalary = weeklySalary;
        }
        else
            this.weeklySalary = 0;


    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Weekly Salary = " + weeklySalary
                ;
    }
}