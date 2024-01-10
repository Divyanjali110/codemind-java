import java.util.Scanner;
public class Digits{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int r= y/10;
        int r1=y%10;
        int r2=r%10;
        System.out.printf("%d%d",r2,r1);
    }
}