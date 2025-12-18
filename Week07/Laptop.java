package Week07;


public class Laptop
{
    int price;
    String brand;
    int ram;
    Laptop(String b, int r, int p)
    {
        brand = b;
        ram = r;
        price = p;
    }
    @Override
    public String toString()
    {
        return brand+" "+ram+ " "+price;
    }
    
}