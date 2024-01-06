import java.util.Scanner;
public class Temperature
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double c=sc.nextDouble();
        double f=(32+(c*1.8));
        System.out.printf("%.2f",f);
    }
}