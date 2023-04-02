import java.util.*;

public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        Arrays.sort(a);

        System.out.println("Ascending  Order");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for (int i=0;i<n-1;i++) {
            for (int j = i + 1; j<n;j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("descending Order");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
