import java.util.Scanner;
public class ReachHome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int k=5*x;
        if (k>=y)
        {
            System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }        
    }
}