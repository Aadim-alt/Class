package Week07;


public class Result
{
    double s1,s2,s3;
    Result(double s1,double s2,double s3)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    double marks()
    {
        return s1+s2+s3;
    }
    double percentage()
    {
        return (marks()/300)*100;
    }
}