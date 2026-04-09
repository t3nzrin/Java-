/* This keyword 
  It is a reference variable that refers to the current object.
  (The object whose method or constructor is being called.)
  */
//program using this to refer instance variable
public class thisStudent
  {
    int id;
    String name;
    Student(int id, String name)
    {
      this.id=id;//instace variable
    this.name=name;
    }
    void display()
    {
      System.out.println("Name: " +name);
      System.out.println("id: " +id);
    }
  }
public class thisStudent
  {
    public static void main(String[] args)
    {
      Student s= new Student(101, "Rahul");
      s.display();
    }
  }
