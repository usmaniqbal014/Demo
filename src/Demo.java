import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo {

    public static void main( String args[] )throws Exception
    {
        /*int num1=10;
        int num2=5;
        Caculator cal=new Caculator();
        //cal.sum(20,30);
        System.out.println(cal.sum(num1,num2));
        System.out.println(cal.substraction(num1,num2));

        Rectangle r1=new Rectangle();
        r1.setlength(90.0);
        System.out.println(r1.getlength());*/
       // public static void main(String[] args)throws Exception {
        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);
    }
}
