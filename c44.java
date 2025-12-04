import java.util.Scanner;
public class c44{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        
        if (n % 2==0){
            System.out.println("its even");
        }
        
        else{
            System.out.println("its odd");
        }
    }
}
        
        
    