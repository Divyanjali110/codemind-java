import java.util.Scanner;
public class RomeoAndJuliet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int five=sc.nextInt();
        int ten=sc.nextInt();
        int cost=sc.nextInt();
        int choco=((5*five)+(10*ten))/cost;
        System.out.printf("%d",choco);
    }
}