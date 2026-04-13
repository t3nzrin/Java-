import java.util.Scanner;
public class arrayuser
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[] =  new int[3];
        System.out.println("Enter the 3 integer data");
        for(int i = 0; i < 3; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array stored data");
        for (int i= 0; i < 3; i++)
        {
            System.out.println(arr[i]);

        }
    }
    sc.close();
}
