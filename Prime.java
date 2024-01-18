import java.util.Scanner;
public class Prime
{
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int fact=0;
        for (i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               fact++;
            }
        }
        if(fact==2)
        {
            System.out.printf("Prime");
        }
        else 
        {
            System.out.printf("Not Prime");
        }
    }
}