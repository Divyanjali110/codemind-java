import java.util.*;
public class Slices
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String result = s.substring(start,end+1);
        System.out.println(result);
    }
}