import java.util.*;

public class sample2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("The elements in reverse order - ");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+",");
        }
    }    
}
