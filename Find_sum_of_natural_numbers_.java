import java.util.Scanner;
public class Natural_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=(n*(n+1))/2;
        System.out.printf("%d",s);
        
    }
}