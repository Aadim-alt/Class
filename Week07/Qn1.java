package Week07;


public class Qn1
{
    public static void main(String[] args)
    {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.title = "Harry Potter";
        book1.author = "J.K Rowling";
        book1.price = 700;
         book2.title = "The Faith of Aadim";
        book2.author = "Aadim Dhakal";
        book2.price = 500;
        System.out.println(book1.title+" "+book1.author+" "+book1.price);
        System.out.println(book2.title+" "+book2.author+" "+book2.price);
    }
}