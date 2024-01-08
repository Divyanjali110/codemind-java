import java.util.Scanner;
public class Emloyee{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    double  basicSalary=sc.nextDouble();
    double  hra=sc.nextDouble();
    double  da=sc.nextDouble();
    double p=(12*basicSalary)/100;
    double g=(basicSalary+hra+da+p);
    System.out.printf("%.2f
",p);
    System.out.printf("%.2f
",g);
    }
}