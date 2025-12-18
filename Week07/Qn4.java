package Week07;

public class Qn4
{
    public static void main(String[] args)
    {
        Laptop l1 = new Laptop("ASUS Vivo Book",8,100000);
        Laptop l2 = new Laptop("Lenovo Yoga",16,265000);
        Laptop l3 = new Laptop("Acer Nitro",16,140000);   
        
        
        if (l1.ram>8)
        {
        System.out.println(l1);
        }
        if (l2.ram>8)
        {
        System.out.println(l2);
        }
        if (l3.ram>8)
        {
        System.out.println(l3);
        }
    
    }
}