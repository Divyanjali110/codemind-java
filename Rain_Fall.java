import java.util.Scanner;
public class Rainfall
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<3)
        {
            System.out.printf("LIGHT");
        }
        else if(x>=3 & x<7)
        {
            System.out.printf("MODERATE");
        }
        else 
        {
            System.out.printf("HEAVY");
        }
    }
}