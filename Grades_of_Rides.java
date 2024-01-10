import java.util.Scanner;
public class Rides{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int s=sc.nextInt();
        int sp=sc.nextInt();
        if(h>50 & s>60 & sp>100)
        {
            System.out.printf("10");
        }
        else if(h>50 & s>60)
        {
        System.out.printf("9");
        }
        else if(s>60 & sp>100)
        {
        System.out.printf("8");
        }
        else if(h>50 & sp>100)
        {
        System.out.printf("7");
        }
        else if(h>50 || s>60 || sp>100)
        {
        System.out.printf("6");
        }
        else
        {
            System.out.printf("5");
        }
        
        
    }
}