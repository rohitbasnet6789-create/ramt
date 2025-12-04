import java.util.Scanner;

public class Rickshaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Distance");
        double d = sc.nextDouble();
        
        System.out.println("Time");
        double t = sc.nextDouble();
        
        System.out.println("Local? (y/n)");
        String local = sc.next();
        
        System.out.println("Night? (y/n)");
        String night = sc.next();
        
        double fare;
        
        //Base fare calculation
        if (d <=1) {
            fare = 20;
        } else {
            fare = 20 + (d - 1) * 12;
        }
        
        // Time charge
        fare = fare + t * 3;
        
        // Night charge +15%
        if (night.equalsIgnoreCase("y")) {
            fare = fare + fare * 0.15;
        }
        
        // Local discount -10%
        if (local.equalsIgnoreCase("y")) {
            fare = fare - fare *0.10; 
        }
        
        //Minimum fare
        if (fare < 50) {
            fare = 50;
        }
        
        System.out.println("Rs. " + Math.round(fare));
        
        
    }
}