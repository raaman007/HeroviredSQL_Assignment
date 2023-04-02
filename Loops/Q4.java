import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu based app-Even/Odd Checker");
        char ch;
        do {
            System.out.println("Please enter the number: ");
            int n=sc.nextInt();
            if(n%2==0) System.out.println(n+" is an EVEN Number");
            else System.out.println(n+" is an ODD Number");
            
            System.out.println("Do you want to Continue(y/n):");
            ch=sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
    }
}
