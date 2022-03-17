
package BankAccount;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        //    BanckAccount.nonSense();
        //  BanckAccount ac=new BanckAccount("Muhammad","Abrar",500.0);
        Scanner sc = new    Scanner( System.in);
        System.out.println("Enter First Name");
        String name = sc.nextLine();
        System.out.println("Enter Last Name");
        String fname = sc.nextLine();
        System.out.println("Enter opening Balance");
        double openingBalance = sc.nextInt();
        Date D = new Date(24,10,2001);
        Date D1 = new Date(24,10,2001);
        BanckAccount account1=new BanckAccount(name,fname,500.0,"us7081789@gmail.com",D,D1);
        BanckAccount account2=new BanckAccount("Umair","Zafar",1000.0);
        //Date date1=new Date(22,2,2022);
       // BanckAccount account3=new BanckAccount("Zaman","Khan",0.0, "zaman@gmail.com",new Date(22,2,2022),new);

        System.out.println(account1);
        System.out.println(account2);
        //System.out.println(account3);


        //BanckAccount.nonSense();




    }
}

      /*   Creating class with instance attributes and methods .... yani ka ek class bno jis mn variable private ho

Accessing instance attributes from methods     .... private variable ko dosri class mn function bna kr call kro.

Calling methods from outside the object and from whithin same object .... usa object ka bbahir sa call krn ya phir within object

Appreciating how object oriented design help to write maintainable code   ... dekho object mn new cheez hmn kya chahiya

Planning how and where we add new requirements in object oriented design   ...
important
This task explains only one program, parts are made to make it easy to understand and impelement step by step,
only for learning objective. Do not make different programs for each part.

Part 1
Make BankAccount lass that shall have balance and name attributes of type double and
String. Implement void deposit(double amount) and void withdraw(double amount) methods
inside the BankAccount class. The deposit method shall increase the balance by
passed value and withdraw method should decrease the balance with passed amount.

Make BankAccountTest class. Inside its main(String args[]) method, create a new object of BankAccount class.
 Get balance and name of account holder from user input and use user entered data to initilize object instance attributes.


       */