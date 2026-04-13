//Array list is a class in java that is the part of java collections frame work.
//It is used to store multiple elements like an array but with more flexibility.
//array;ost is a dynamic size that means it can grow and shrink
import java.util.ArrayList;
public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(100);
        System.out.println(list);
        //remove list element
        list.remove(1);
        System.out.println(list);
    }
    
    


}
