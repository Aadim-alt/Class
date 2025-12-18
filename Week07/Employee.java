package Week07;



public class Employee
{
    int id;
    String name;
    double salary;
    Employee(int id, String n, double s)
    {
        this.id = id;
        name = n;
        salary = s;
    }
    public String toString()
    {
        return this.id +" "+name+" "+salary;
    }
    
}