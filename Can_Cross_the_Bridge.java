import java.util.Scanner;
public class Monopoly{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mw= sc.nextInt();
        int tw= sc.nextInt();
        int bw= sc.nextInt();
        int tm=(bw-tw)/mw;
        System.out.printf("%d",tm);
        
    }
        
}
