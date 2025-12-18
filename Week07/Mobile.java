package Week07;


public class Mobile
{
    int price;
    String brand;
    
    Mobile(String b,int p)
    {
        brand = b;
        
        price = p;
    }
    @Override
    public String toString()
    {
        return brand+" "+price;
    }
    void isAffordable()
    {
        if(price>20000)
        {
            System.out.println(brand +" This Phone is Affordable");
        }
    }
}