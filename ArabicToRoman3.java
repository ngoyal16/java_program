import java.util.Scanner;

public class ArabicToRoman{
    public static void main(String []args){
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please Enter the a number between 1 to 20 : ");
        int choice = user_input.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("You have enterd '1'. The Roman equivalent is 'I'");
                break;
            case 2:
                System.out.println("You have enterd '2'. The Roman equivalent is 'II'");
                break;
            case 3:
                System.out.println("You have enterd '3'. The Roman equivalent is 'III'");
                break;
            case 4:
                System.out.println("You have enterd '4'. The Roman equivalent is 'IV'");
                break;
            case 5:
                System.out.println("You have enterd '5'. The Roman equivalent is 'V'");
                break;
            case 6:
                System.out.println("You have enterd '6'. The Roman equivalent is 'VI'");
                break;
            case 7:
                System.out.println("You have enterd '7'. The Roman equivalent is 'VII'");
                break;
            case 8:
                System.out.println("You have enterd '8'. The Roman equivalent is 'VIII'");
                break;
            case 9:
                System.out.println("You have enterd '9'. The Roman equivalent is 'IX'");
                break;
            case 10:
                System.out.println("You have enterd '10'. The Roman equivalent is 'X'");
                break;
            case 11:
                System.out.println("You have enterd '11'. The Roman equivalent is 'XI'");
                break;
            case 12:
                System.out.println("You have enterd '12'. The Roman equivalent is 'XII'");
                break;
            case 13:
                System.out.println("You have enterd '13'. The Roman equivalent is 'XIII'");
                break;
            case 14:
                System.out.println("You have enterd '14'. The Roman equivalent is 'XIV'");
                break;
            case 15:
                System.out.println("You have enterd '15'. The Roman equivalent is 'XV'");
                break;
            case 16:
                System.out.println("You have enterd '16'. The Roman equivalent is 'XVI'");
                break;
            case 17:
                System.out.println("You have enterd '17'. The Roman equivalent is 'XVII'");
                break;
            case 18:
                System.out.println("You have enterd '18'. The Roman equivalent is 'XVIII'");
                break;
            case 19:
                System.out.println("You have enterd '19'. The Roman equivalent is 'XIX'");
                break;
            case 20:
                System.out.println("You have enterd '20'. The Roman equivalent is 'XX'");
                break;
            default:
                System.out.println("You have enterd a number which is out of range");
                break;
        }
    }
}
