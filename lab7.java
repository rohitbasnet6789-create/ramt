import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {

        String[][] seat = { {"ram", "sita", "radha"}, {null, null, null} };
        System.out.println("Seat(row/column) \t 1 \t 2 \t 3");

        for(int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "\t\t");

            for(int j = 0; j < 3; j++) {
                if(seat[i][j] != null) {
                    System.out.print("\t" + seat[i][j]);
                } else {
                    System.out.print("\tempty");
                }
            }
            System.out.println();
        }
    }
}