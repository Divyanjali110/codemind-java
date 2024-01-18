import java.util.Scanner;
public class DIigits_Count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int digits=0;
        
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        System.out.printf("%d",digits);
    }
}