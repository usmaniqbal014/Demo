package UsmanIqbal;

import java.util.*;

public class us {

    public static void main( String args[] )
    {
        int a=0,b=0,i=1,choice;
        Scanner us = new Scanner( System.in );
        System.out.println("Enter your First Name ");
        String name = us.nextLine();
        System.out.println("Enter your Last Name ");
        String Fname = us.nextLine();
        System.out.println("Enter opening Balance");
        double balance = us.nextDouble();

        Check Account1 = new Check(name,Fname,balance);

        //System.out.println(Account1);
        do {
            System.out.println("Press 1: To Deposit an amount");
            System.out.println("Press 2: To Withdraw an amount");
            System.out.println("Press 3: To View the current balance");
            System.out.println("Press 4: To SMS Alert");
            System.out.println("Press 5: Debit card");
            System.out.println("Press 6: both");
            System.out.println("Press 7: To Close this program");
            choice = us.nextInt();
            //acc call = new acc();
        }while( choice != 7);
        System.out.println(Account1);




    }
}

/*
      Press 1: To Deposit an amount
      Press 2: To Withdraw an amount
      Press 3: To View the current balance
      Press 4: To Close this program
*/