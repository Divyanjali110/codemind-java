import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
         int b=sc.nextInt();
         int r;
         for(int i=a;i<=b;i++)
         {
             r=n*i;
             System.out.printf("%d x %d = %d
",n,i,r);
         }
    }
}