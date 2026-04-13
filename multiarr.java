/*2-D array: like a table with rows and columns*/
public class multiarr
{
    public static void main(String[] args)
    {
        int arr[][]= {{1,2,3}, {5,8,9}};
        System.out.println("The 2D elements stored : ");
        for(int i = 0; i<2; i++)//for rows
        {
            for(int j=0; j<3; j++)//for columms
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
