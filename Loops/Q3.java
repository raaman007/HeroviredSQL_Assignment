import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberA=sc.nextInt();
        int numberB=sc.nextInt();

        numberA=numberA+numberB;
        numberB=numberA-numberB;
        numberA=numberA-numberB;
        
        System.out.println("numberA = "+numberA);
        System.out.println("numberB = "+numberB);
    }
}

