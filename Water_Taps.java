import java.util.Scanner;
public class FillTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int time = (X * Y) / (X + Y);

        System.out.printf("%d", time);
    }
}
