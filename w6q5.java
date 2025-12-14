import java.util.Scanner;

public class w6q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i] + " ");
        }

        System.out.println("\nEnter no of districts: ");
        int no = input.nextInt();
        input.nextLine();  

        String dis[] = new String[no];

        for (int i = 0; i < dis.length; i++) {
            dis[i] = input.nextLine();
        }

        for (int i = 0; i < dis.length; i++) {
            System.out.println(dis[i]);
        }
    }
}