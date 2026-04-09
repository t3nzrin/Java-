//this keyword used to call current class 
class Test{
  void show()
  {
    System.out.println("hello");
  }
  void display()
  {
    this.show();
  }
}
public class thisclass
  {
    public static void main(String[] args)
    {
      Test t = new Test();
      t.display();
    }
  }
