import java.util.Scanner;
public class Hypotenuse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         double a=sc.nextDouble();
        double b=sc.nextDouble();
        double h=((a*a) +(b*b));
        
        System.out.printf("%.2f",Math.sqrt(h));
       
    }
}


