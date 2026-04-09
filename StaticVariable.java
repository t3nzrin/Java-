/* Static keyword
The static keyword is used to define member variables,
methods, blocks, nested classes which belongs to the class 
rater than the object.
*/
//program with static variable
class Student
  {
    int id;
    String name;
    static String college = "DLIHE";
    Student(int id, String name)
    {
      this.id = id;
      this.name = name;
    }
    void display()
    {
      System.out.println("Name:" +name);
      System.out.println("Id:" +id);
      System.out.println("college:" +college);
  }
  }
public class StaticVariable
  {
    public static void main(String[] args)
    {
     Student s = new Student( 20, "Rahul");   
     s.display();
    }
  }

    
    
    
