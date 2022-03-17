package FA21BSE014USMAN;

public class UDate {
    private int day;
    private int mounth;
    private int year;

    public UDate( int day, int mounth, int year )
    {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
