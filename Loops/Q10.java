import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("String Name: ");
        String s = sc.nextLine();

        System.out.print("Starting index: ");
        int Start = sc.nextInt();

        System.out.print("Ending index: ");
        int End = sc.nextInt();

        String ans= s.substring(Start, End + 1);

        System.out.println("SubString of " + s + " from " + Start + " to " + End + " is: " +ans);
    }
}
