public class Rectangle {
    // instance variable, field, attributes
    // encapsulated

    private double length;
    private double width;

    public void setlength( double length )
    {
        if(length>=0)
            this.length=length;
    }

    public double getlength()
    {
        return this.length;
    }
}
