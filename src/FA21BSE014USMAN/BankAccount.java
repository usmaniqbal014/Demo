package FA21BSE014USMAN;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double openingBalance;
    private double withdraw;
    private double deposite;
    private double am;
    private double tax;
    private int counter1, counter2 ;
    //private int accountNumber;

    //constructor
    public BankAccount ( String firstName, String lastName, double openingBalnce )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.openingBalance = openingBalnce;
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

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {

        if( openingBalance < 50000 )
        {
            tax = tax + withdraw + ( withdraw * 0.02 );
            this.withdraw = tax ;
        }
        else
        {
            this.withdraw = withdraw;
        }
        ++counter1;
    }

    public double getDeposite() {
        return deposite;
    }

    public void setDeposite(double deposite) {

        if( openingBalance >= 100000 )
        {
            am = am + deposite + ( deposite * 0.01 );
            this.deposite  = am ;
        }
        else
        {
            this.deposite = deposite;
        }
            ++counter2;
    }

    @Override
    public String toString() {
        return
                " Account Title: " + firstName + " " +  lastName + "\n" +
                " Total Deposit: " + counter2 + "\n" +
                " Total Withdraw: " + counter1 + "\n" +
                " Balance=" + ( openingBalance + deposite - withdraw )
                ;
    }


}
