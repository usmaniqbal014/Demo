public class Date {

    public static void main( String args[] ) {
        CompareDate y = new CompareDate();
        CompareDate m = new CompareDate();
        CompareDate d = new CompareDate();
        CompareDate y1 = new CompareDate();
        CompareDate m1 = new CompareDate();
        CompareDate d1 = new CompareDate();
        y.setYears(1900);
        m.setMounths(1);
        d.setDays(7);
        y1.setYears(1900);
        m1.setMounths(1);
        d1.setDays(6);
       // Date firstDate1 = new Date(int year, int month, int date);
        System.out.println("Date 1 is = " + y.getYears() + "." + m.getMounths() + "." + d.getDays());
        System.out.println("Date 2 is = " + y1.getYears() + "." + m1.getMounths() + "." + d1.getDays());
        if(y.getYears()>y1.getYears())
        {
            System.out.println( y.getYears() + "." + m.getMounths() + "." + d.getDays());
        }
        if(y1.getYears()>y.getYears())
        {
            System.out.println( y1.getYears() + "." + m1.getMounths() + "." + d1.getDays());
        }
        if(y.getYears() == y1.getYears())
        {
            if(m.getMounths()>m1.getMounths())
            {
                System.out.println(y.getYears() + "." + m.getMounths() + "." + d.getDays());
            }
            if(m1.getMounths()>m.getMounths())
            {
                System.out.println(y1.getYears() + "." + m1.getMounths() + "." + d1.getDays());
            }
            if(m.getMounths() == m1.getMounths())
            {
                if(d.getDays() > d1.getDays())
                {
                    System.out.println(y.getYears() + "." + m.getMounths() + "." + d.getDays());
                }
                if(d.getDays() < d1.getDays())
                {
                    System.out.println(y1.getYears() + "." + m1.getMounths() + "." + d1.getDays());
                }
            }

        }



    }
}
