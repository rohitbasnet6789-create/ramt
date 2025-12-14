import java.util.Scanner;
public class w6q3
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner (System.in);
        String[] names = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
        
        for(int i=0; i< names.length; i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names[2]);
        names[4]="Rohit";
        System.out.println(names[4]);
    
        Scanner input= new Scanner (System.in);
        System.out.println("Enter a new name");
        
        String newName = sc.nextLine();
        int idx= sc.nextInt();
        names[idx]=newName;
        System.out.println(idx);
        System.out.println(newName);
        
        

        
        
        
        
    }
}