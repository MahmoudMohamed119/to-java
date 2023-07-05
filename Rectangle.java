public class Rectangle {
    // Constructors
    public Rectangle()
    {
        lenght=10;
        width=15;
        System.out.println("a new room created with lenght=10 and width=15");
    }
    //constructor overloading
    public Rectangle(double i ,double w)
    {
        lenght=i;
        width=w;
    }

    private double lenght;
    private double width;

    public void setLenght(double i)
    {
        lenght=i;
    }

    public void setWidth (double w)
    {
        width=w;
    }

   public double getLenght()
   {
       return lenght;
    }


    public double getWidth()
    {
        return width;
    }
    public double getarea()
    {
        return lenght * width;
    }

    public boolean isequal(Rectangle obj2)
    {
        if(this.lenght==obj2.lenght && this.width==obj2.width)
            return true;
        else
            return false;
    }

    public Rectangle(Rectangle soucepbject)
    {
        lenght=soucepbject.lenght;
        width=soucepbject.width;
    }


}
