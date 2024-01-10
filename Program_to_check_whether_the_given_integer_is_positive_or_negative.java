import java.util.Scanner;
public class Camparsion{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(y<0)
        {
            System.out.printf("Negative Number");
        }
        else
        System.out.printf("Positive Number");
    }
}