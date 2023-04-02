import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("num1 = ");
        int num1=sc.nextInt();
        System.out.println("num2 = ");
        int num2=sc.nextInt();
        System.out.println("num3 = ");
        int num3=sc.nextInt();

        int max=(num1>num2) ? (num1>num3 ? num1:num3) : (num2> num3? num2 : num3);
        int min=(num1<num2) ? (num1<num3 ? num1:num3) : (num2<num3? num2 : num3);
        int avg=(num1+num2+num3)/3;

        System.out.println("The Smallest Number: "+min);
        System.out.println("The Largest Number: "+max);
        System.out.println("Average of all three numbers: "+avg);
    }
}
