import java.util.Scanner;
public class Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        int y=i/365;
        i=i % 365;
        
        int w= i/7;
        i=i % 7;
        System.out.printf("%d
",y);
        System.out.printf("%d",w);
        
    }
        
}
