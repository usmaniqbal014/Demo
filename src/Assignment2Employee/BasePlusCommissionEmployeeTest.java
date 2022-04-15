package Assignment2Employee;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // instantiate BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(35303,"Usman", "Iqbal", "1914105", 1000, 0.1, 400);

        // get base-salaried commission employee data
        System.out.println("By Get Methods :");

        System.out.println("First name is " +  employee.getFirstName());
        System.out.println("Last name is " + employee.getLastName());
        System.out.println("Social security number is " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales is " + employee.getGrossSales());
        System.out.println("Commission rate is " + employee.getCommissionRate());
        System.out.println("Base salary is " +  employee.getBaseSalary());
        System.out.println("Earnings" + employee.earning());
        System.out.println("Bonus " + employee.bonuss());

        employee.setBaseSalary(500) ;
        System.out.println( employee);
        System.out.println("Earnings " + employee.earning());
        System.out.println("Bonus " + employee.bonuss());

    }
}