import java.util.Scanner;
public class factorial {
    public static void main(String[] args )
    {
        Scanner s= new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = s.nextInt();
        int fac=1;
        for(int i=1;i<=num;i++)
        {
            fac=fac*i;
        }
        System.out.print("the factorial of number u enteres is : "+ fac);
    }
}
