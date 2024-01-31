import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ld=n%10;
        int fd=0;
        while(n!=0)
        {
            fd=n%10;
            n=n/10;
        }
        System.out.printf("%d",fd+ld);
    }
}