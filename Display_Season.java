import java.util.Scanner;
public class Season{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==4 || x==5||x==6)
        {
            System.out.printf("Summer");
        }
        else if(x==7 || x==8||x==9 ||x==10)
        {
            System.out.printf("Rainy");
        }
        else if(x==11 || x==12||x==1)
        {
            System.out.printf("Winter");
        }
        else if(x==2 || x==3)
        {
            System.out.printf("Spring");
        }
        else
        {
            System.out.println(-1);
        }
        
    }
}