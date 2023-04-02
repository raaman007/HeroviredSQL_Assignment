import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=0;
        char ch;
        do {
            System.out.println("1.CM to M");
            System.out.println("2.M to KM");
            System.out.println("3.KM to M");
            System.out.println("4.M to CM");
            System.out.println("Enter your menu - ");
            num=sc.nextInt();
            if(num==1){
                System.out.println("Please enter the CM Value: ");
                int ans=sc.nextInt();
                System.out.println(ans+" CM = "+(float)ans/100+" M");
            }
            else if(num==2){
                System.out.println("Please enter the M Value: ");
                int ans=sc.nextInt();
                System.out.println(ans+" M = "+(float)ans/1000+" KM");
            }
            else if(num==3){
                System.out.println("Please enter the KM Value: ");
                int ans=sc.nextInt();
                System.out.println(ans+" KM = "+(float)ans*1000+" M");
            }
            else if(num==4){
                System.out.println("Please enter the M Value: ");
                int ans=sc.nextInt();
                System.out.println(ans+" M = "+(float)ans*100+" CM");
            }
            System.out.println("Do you want to Continue:");
            ch=sc.next().charAt(0);
        }while(ch=='Y' ||   ch=='y');
    }
}
