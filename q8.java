import java.util.Scanner;
public class q8
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter GPA");
        float gpa = sc.nextFloat();
        if(gpa>=3.6){
            System.out.println("Grade is A+");
        }
        else if(gpa>=3.2){
            System.out.println("Grade is A");
        }
        else if(gpa>=2.8){
            System.out.println("Grade is B+");
        }
        else if(gpa>=2.4){
            System.out.println("Grade is B");
        }
        else if(gpa>=2){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("ng");
        }
        }
        }