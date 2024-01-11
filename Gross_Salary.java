import java.util.Scanner;
public class GrossSalary
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int bs=sc.nextInt();
        if(bs<=10000)
        {
            double da=0.8*bs;
            double hra=0.2*bs;
            double gs1=bs+da+hra;
            System.out.printf("%.2f",gs1);
        }
        else if(bs<=20000)
        {
            double da=0.9*bs;
            double hra=0.25*bs;
            double gs2=bs+da+hra;
            System.out.printf("%.2f",gs2);
        }
        else 
        {
            double da=0.95*bs;
            double hra=0.3*bs;
            double gs3=bs+da+hra;
            System.out.printf("%.2f",gs3);
        }
    }
}