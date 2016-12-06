import java.util.Scanner;

public class ArabicToRoman{
    public static void main(String []args){
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please Enter the a number between 1 to 10 : ");
        int choice = user_input.nextInt();
        
        if(choice == 1){
            System.out.println("You have enterd '1'. The Roman equivalent is 'I'");
        }else if(choice == 2){
            System.out.println("You have enterd '2'. The Roman equivalent is 'II'");
        }else if(choice == 3){
            System.out.println("You have enterd '3'. The Roman equivalent is 'III'");
        }else if(choice == 4){
            System.out.println("You have enterd '4'. The Roman equivalent is 'IV'");
        }else if(choice == 5){
            System.out.println("You have enterd '5'. The Roman equivalent is 'V'");
        }else if(choice == 5){
            System.out.println("You have enterd '6'. The Roman equivalent is 'VI'");
        }else if(choice == 5){
            System.out.println("You have enterd '7'. The Roman equivalent is 'VII'");
        }else if(choice == 5){
            System.out.println("You have enterd '8'. The Roman equivalent is 'VIII'");
        }else if(choice == 5){
            System.out.println("You have enterd '9'. The Roman equivalent is 'IX'");
        }else if(choice == 5){
            System.out.println("You have enterd '10'. The Roman equivalent is 'X'");
        }else{
            System.out.println("You have enterd a number which is out of range");
        }
    }
}
