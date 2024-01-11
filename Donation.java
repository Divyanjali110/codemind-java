import java.util.Scanner;
public class Donation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y)
        {
            System.out.printf("%d",(x-y));
        }
        else 
        {
            System.out.printf("%d",(y-x));
        }
    }
}