import java.util.*;

public class sample5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Array Size: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) 
        a[i]=sc.nextInt();

        int o=0;
        for(int i=0;i<n;i++){
            if(a[i]==1) 
            o++;
        }
        int ans[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=1){
                ans[j]=ar[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            ans[i]=1;
        }
        System.out.println("Array Elements after moving Ones to end: ");
        for(int i=0;i<n;i++) System.out.print(ans[i]+",");
    }    
}
