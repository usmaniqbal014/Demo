package Assignment2Employee;

public class CommissionEmployeeTest {
    public static void main(String args[]) {
        // instantiate CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee(35303,"Usman", "Iqbal", "1914105", 1000, 0.03);

        // get commission employee data
        System.out.println("By Get Methods:");
        System.out.println("First name is " + employee.getFirstName() );
        System.out.println("Last name is "  + employee.getLastName());
        System.out.println("Social security number is " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commission rate is " + employee.getCommissionRate());
        System.out.println("Earning " + employee.earnings());
        System.out.println("Bonus " + employee.bonus());

        employee.setGrossSales(10000);
        employee.setCommissionRate(0.1);

        System.out.println(employee);
        System.out.println("Earning " + employee.earnings());
        System.out.println("Bonus " + employee.bonus());

    }
}