package Week07;



public class Rectangle
{
    double width;
    double height;
    Rectangle(double w, double h)
    {
        height = h;
        width = w;
        
    }
    @Override
        public String toString()
        {
            return width+" is width and"+height+ " is height";
        }
    double area()
    {
        return height*width;
    }
}