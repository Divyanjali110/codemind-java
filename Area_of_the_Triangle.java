import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double t=(s)*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(t));
    }
}