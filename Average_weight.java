import java.util.Scanner;
public class Weight{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int average=sc.nextInt();
        int boy1Weight=sc.nextInt();
        int boy2Weight=sc.nextInt();
        int boy3Weight=(3*average-boy1Weight-boy2Weight);
        System.out.printf("%d",boy3Weight);
    }
}