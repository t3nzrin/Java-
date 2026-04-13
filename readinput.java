import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class readinput
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //to read entire line
        System.out.println("Enter your name:");
        String str=br.readLine();
        System.out.println("Your Name: "+str);
        //to read integer
        System.out.println("Enter your age:");
        int age=Integer.parseInt(br.readLine());
        System.out.println("Your Age: "+age);
        //to read a single character
        System.out.println("Enter your grade:");
        char grade=(char)br.read();
        System.out.println("Your grade: "+grade);

    }
}
