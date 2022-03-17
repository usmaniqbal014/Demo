package UsmanIqbal;

import java.util.*;

public class Check {
    private String firstName;
    private String lastName;
    private double openingBalance;
    private double withdraw;
    private double deposite;
    private double am;
    private double tax;
    private int counter1, counter2 ,a,b,i=1;
    //private int accountNumber;
    Scanner u = new Scanner( System.in );
    public void acc( int choice )
    {


            switch (choice) {
                case 1:
                    System.out.println("Enter amount to Deposit");
                    double deposit = u.nextDouble();
                    //return deposite;
                    a++;
                    break;
                case 2:
                    System.out.println("Enter amount to Withdraw");
                    double withdraw = u.nextDouble();
                    //return withdraw;
                    b++;
                    break;
                case 3:
                    System.out.println("Your current Balance is " + openingBalance );
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    i=7;
                    break;
            }


    }
    //constructor
    public Check ( String firstName, String lastName, double openingBalnce )
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
