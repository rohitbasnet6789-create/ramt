import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {

        int[][] marks = { {80, 70}, {60, 50} };
        System.out.println("Student \t Nepali \t English");

        for(int i = 0; i < 2; i++) {
            System.out.print(i + 1);
            for(int j = 0; j < 2; j++) {
                System.out.print("\t\t" + marks[i][j]);
            }
            System.out.println();
        }

        int[] totalmark = new int[2];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                totalmark[i] = totalmark[i] + marks[i][j];
            }
            System.out.println("Total marks of student no. " + (i + 1) + " = " + totalmark[i]);
        }
    }
}