import java.util.*;

public class sample6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Emter n value: ");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter array SuperSet Elements: ");
        for(int i=0;i<n;i++) 
        a[i]=sc.nextInt();

        System.out.println("Emter m value: ");
        int m=sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter array SubSet Elements: ");
        for(int i=0;i<m;i++) 
        b[i]=sc.nextInt();

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int ele:a){
            if(hm.containsKey(ele)) hm.put(ele,hm.get(ele)+1);
            else hm.put(ele,1);
        }

        for(int i=0;i<m;i++){
            if(!hm.containsKey(b[i])) System.out.println("Frequence of "+b[i]+": 0");
            else System.out.println("Frequence of "+b[i]+": "+hm.get(b[i]));
        }
    }    
}
