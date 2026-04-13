import java.util.Arrays;
public class Arraymethods
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30};
        //length property
        System.out.println("Length of the array: "+arr.length);
        //array method equals(), copyOfrange(), toString(), sort()
        //equals()
        int a[]= {1,2,3};
        int b[]= {1,2,3};
        //equals() is used to compare two arrays
        System.out.println("compare a array with b array: "+Arrays.equals(a,b));

    }
}
