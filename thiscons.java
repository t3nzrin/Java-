//this () to call constructor
class Demo
  {
    Demo()
    {
      System.out.println("Default constructor");
        }
    Demo(int x)
    {
      System.out.println("Parameterized constructor: " +x);
  }
  }
public class thiscons
  {
    public static void main(String[] args)
    {
      Demo d = new Demo();
    }
  }

    
