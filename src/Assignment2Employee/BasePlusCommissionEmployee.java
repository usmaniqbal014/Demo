package Assignment2Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(int CNIC, String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(CNIC, firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary >= 0.0)
        {
            this.baseSalary = baseSalary;
        }
        else
            this.baseSalary = 0;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0)
        {
            this.baseSalary = baseSalary;
        }
        else
            this.baseSalary = 0;


    }
    public double earning() {
        // not allowed: commissionRate and grossSales private in superclass
        return baseSalary + super.earnings();
    }


    public double bonuss() {
        double commission = earning();
        if(commission>=10000 && commission<=20000)
        {
            return 5000;
        }
        if(commission>=20001 && commission<=50000)
        {
            return 10000;
        }
        if(commission>=50001)
        {
            return 20000;
        }
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Base Salary = " + baseSalary
                ;
    }
}