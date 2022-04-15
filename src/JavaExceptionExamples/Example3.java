package JavaExceptionExamples;

public class Example3 {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception by using Exception class
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}/*
public class TryCatchExample5 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // displaying the custom message
            System.out.println("Can't divided by zero");
        }
    }

}
public class TryCatchExample6 {

    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try
        {
            data=i/j; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // resolving the exception in catch block
            System.out.println(i/(j+2));
        }
    }
}
public class TryCatchExample7 {

    public static void main(String[] args) {

        try
        {
            int data1=50/0; //may throw exception

        }
        // handling the exception
        catch(Exception e)
        {
            // generating the exception in catch block
            int data2=50/0; //may throw exception

        }
        System.out.println("rest of the code");
    }
}
public class TryCatchExample8 {

    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception

        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
public class TryCatchExample9 {

    public static void main(String[] args) {
        try
        {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
import java.io.FileNotFoundException;
        import java.io.PrintWriter;

public class TryCatchExample10 {

    public static void main(String[] args) {


        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
    }
}*/

