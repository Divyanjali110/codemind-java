import java.util.Scanner;
public class Car{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int c=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int cs=sc.nextInt();
        float per=((p+c+b+m+cs)*100)/500;
        if(per>=90)
         {
            System.out.println("Grade A");
        }
        else if(per>=80)
         {
            System.out.println("Grade B");
        }
        else if(per>=70)
         {
            System.out.println("Grade C");
        }
        else if(per>=60)
         {
            System.out.println("Grade D");
        }
        else if(per>=40)
         {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
        
    }
}
        