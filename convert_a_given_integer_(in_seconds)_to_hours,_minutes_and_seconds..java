import java.util.Scanner;
public class Time{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int h = (t/3600); 
    int m = (t -(3600*h))/60;
    int s = (t -(3600*h)-(m*60));
     System.out.printf("H:M:S-%d:%d:%d
",h,m,s);
    }
}