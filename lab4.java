import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);   
        }

        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks = totalMarks + a[i];
        }

        System.out.println("total marks = " + totalMarks);
        System.out.println("average = " + (double) totalMarks / 5);
        System.out.println("highest marks = " + a[4]);
        System.out.println("lowest marks = " + a[0]);

        System.out.println("Enter number of subjects:");
        int num = sc.nextInt();

        int[] mark = new int[num];
        System.out.println("Enter marks of subjects:");

        for (int i = 0; i < num; i++) {
            mark[i] = sc.nextInt();
        }

        System.out.println("marks of subjects are:");
        for (int i = 0; i < num; i++) {
            System.out.println(mark[i]);
        }
    }
}