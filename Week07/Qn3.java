package Week07;



public class Qn3
{
    public static void main()
    {
        Employee e1 = new Employee(1,"Shine",40000);
        Employee e2 = new Employee(2,"Aadim",400000);
        Employee e3 = new Employee(3,"Palpasa",100000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        if(e1.salary>e2.salary && e2.salary>e3.salary)
        {
            System.out.println("Highest Salary is: "+e1.salary);
        }
        else if(e2.salary>e3.salary)
        {
            System.out.println("Highest Salary is: "+e2.salary);
        }
        else
        {
            System.out.println("Highest Salary is: "+e2.salary);
        }
    }
   
}