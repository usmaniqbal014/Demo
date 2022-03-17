package FA21BSE014USMAN;

import java.util.*;

public class UsmaniaBank {

    public static void main( String args[] )
    {
        int a=0,b=0,i=1;
        Scanner us = new Scanner( System.in );
        System.out.println();
        System.out.println("Enter your First Name ");
        String name = us.nextLine();
        System.out.println("Enter your Last Name ");
        String Fname = us.nextLine();
        System.out.println("Enter opening Balance");
        double balance = us.nextDouble();
        System.out.println("Enter opening date\nDay");
        int day = us.nextInt();
        System.out.println("Mounth");
        int mounth = us.nextInt();
        System.out.println("Year");
        int year = us.nextInt();

        BankAccount Account1 = new BankAccount(name,Fname,balance);

        //System.out.println(Account1);
        do {
            System.out.println("Press 1: To Deposit an amount");
            System.out.println("Press 2: To Withdraw an amount");
            System.out.println("Press 3: To View the current balance");
            System.out.println("Press 4: To SMS Alert");
            System.out.println("Press 5: Debit card");
            System.out.println("Press 6: both");
            System.out.println("Press 7: To Close this program");
            int choice = us.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to Deposit");
                    double Damount = us.nextDouble();
                    Account1.setDeposite(Damount);
                    a++;
                    break;
                case 2:
                    System.out.println("Enter amount to Withdraw");
                    double Wamount = us.nextDouble();
                    Account1.setWithdraw(Wamount);
                    b++;
                    break;
                case 3:
                    System.out.println("Your current Balance is " + Account1.getOpeningBalance());
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

        }while(i!=7);

        System.out.println(Account1);




    }
}

/*
      Press 1: To Deposit an amount
      Press 2: To Withdraw an amount
      Press 3: To View the current balance
      Press 4: To Close this program
*/