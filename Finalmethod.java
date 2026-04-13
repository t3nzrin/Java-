/* Final method cannot be overriden in a subclass 
*/
class Parent
{
    final void show()
    {
        System.out.println("I am a final method in parent class");
    }
}
class Child extends Parent{
    void show()//error cannot override the fina; method
    {
        System.out.println("I am a show method in child class");
    }
}
public class Finalmethod{
    public static void main(String[] args)
    {
        child ob1 = new Child();
        ob1.show();
    }
}
