package BankAccount;

public class BanckAccount {
    //class attribute
    //class attribute
    private static int accountCounter;

    //instance specific attributes
    private String firstName;
    private String lastName;
    private double openingBalance;
    private int accountNumber,y;
    private String email="No Email Provided";
    private Date openingDate;
    private Date daat;
    private double withdraw;
    private double deposit;

    public void yes()
    {
        if(openingDate.getDay() >= daat.getDay());
    }

    /*static{
        for(int i=0;i<10;i++)
            System.out.println(i);
    }
    {
        System.out.println("Welocme to our bank");
    }*/

    //Date n = new Date();




    //constructor
    // module, no return type, name same as class name
    public BanckAccount(String firstName, String lastName, double openingBalance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.openingBalance=openingBalance;
        this.accountNumber=++accountCounter;
        //print

    }

    //this() is call to default constructor
    public BanckAccount(String firstName, String lastName, double openingBalance, String email,Date openingDate,Date daat){
        //call to four parameters constructor
        this(firstName,lastName,openingBalance);
        this.email=email;
        this.openingDate=openingDate;
        this.daat=daat;

        //print
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
//can not be updated
    /*public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public void display(){
        System.out.printf("Account Number:%d %n",getAccountNumber());
        System.out.printf("First Name :%s %n",this.getFirstName());
        System.out.printf("Last Name: %s%n",getLastName());
        System.out.printf("Opening Balance: %.2f %n",getOpeningBalance());
    }

    // this is non static
    // non static can acccess static or instance variable
    public void setEmail(String email) {
        this.email = email;
        //nonSense();



    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return
                " accountNumber=" + accountNumber + "\n" +
                " firstName= " + firstName + "\n" +
                " lastName= " + lastName + "\n" +
                " openingBalance=" + openingBalance + "\n" +
                " email='" + email + "\n" +
                " openingDate=" + openingDate + "\n" +
                " Daat=" + daat + "\n" +
                " withdraw=" + withdraw + "\n" +
                " deposit=" + deposit + "\n" +
                " Good " + y
                ;
    }



    }
       // this is static this can access only static variable not non static
   /* public static void nonSense(){
        //this.getEmail();
        System.out.println("Non Sense function");
    }*/
