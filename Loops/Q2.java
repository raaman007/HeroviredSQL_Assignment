import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = sc.nextFloat();
        float total = sc.nextFloat();
        float p = (marks/total)*100;

        if (p >= 90) {
            System.out.println("Percentage: "+p+" Grade A, GPA = 4.0");
        }
        else if (p >= 80) {
            System.out.println("Percentage: "+p+" Grade B, GPA = 3.0");
        }
        else if (p >= 70) {
            System.out.println("Percentage: "+p+" Grade C, GPA = 2.0");
        }
        else if (p >= 60) {
            System.out.println("Percentage: "+p+" Grade D, GPA = 1.0");
        }
        else {
            System.out.println("Percentage: "+p+" Grade F, GPA = 0.0");
        }
    }

}
