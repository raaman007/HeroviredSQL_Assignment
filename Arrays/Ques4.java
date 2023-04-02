import java.util.*;

public class sample4 {

    public static boolean prime(int n){
        if (n<=1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Array Size: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=a[0];
        for(int i=0;i<n;i++){
            if(prime(a[i])){
                answr=Math.max(a[i],answr);
            }
        }

        System.out.println("The Largest Prime number in Array: "+answr);
    }
}
