class First
{

    First()
    {
        System.out.println("Called zero arguments constructor in class First: ");
    }
    First(int a)
    {
       
        System.out.println("Called parameterized constructor in class First: " +a);
    }
}
class Second extends First
{
    Second()
    {
        System.out.println("Called zero arguments constructor in class second: ");
    }
    Second(int a)
    {
        super(a);
        System.out.println("Called parameterized constructor in class Second: " +a);
    }


}
class Third extends Second
{
    Third()
    {
        System.out.println("Called zero arguments constructor in class Third: ");
    }
    Third(int a)
    {
        super(a);
        System.out.println("Called parameterized constructor in class Third: " +a);
    }
}
public class suprecons

{
    public static void main(String[] args)
    {
    Third th = new Third();
    Third th1 = new Third(50);
    }
}
