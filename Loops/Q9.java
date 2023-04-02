import java.util.*;

public class Q9 {
    public static boolean prime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num= ");
        int n=sc.nextInt();
        if(prime(n)) System.out.println("The given number "+n+" is a Prime number");
        else System.out.println("The given number "+n+" is not a Prime number");
    }
}
