import java.util.Scanner;
public class c4{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System. in);
        
        System.out.print( "Enter your mark");
        int mark =scanner.nextInt();
        
        if(mark>30){
            System.out.println("you are pass");
            
        }
        else{
            System.out.println("you are fail");
        }
        }
    
}