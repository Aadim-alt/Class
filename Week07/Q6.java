package Week07;


public class Q6
{
    public static void main()
    {
        Result r1 = new Result(78,88,87);
        Result r2 = new Result(72,98,81);
        System.out.println("Total marks of first Student is: "+r1.marks());
        System.out.println("Total marks of Second Student is: "+r2.marks());
        System.out.println("Total percentage of first Student is: "+r1.percentage());
        System.out.println("Total percentage of first Student is: "+r2.percentage());
    }
}