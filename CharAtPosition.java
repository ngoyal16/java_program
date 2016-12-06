import java.util.Scanner;

public class CharAtPosition{
    static Scanner user_input = new Scanner( System.in );
    
    static String str;
    static int pos;
    
    public static void main(String []args){
        getInput(); // get the input from user
        printResult(str.charAt(pos-1)); // print the result
    }
    
    public static void getInput(){
        System.out.print("Please Enter String : ");
        str = user_input.nextLine();
        int len = str.length();
        
        do{
            System.out.print("Please Enter the position you want the character from(1-" + len + ") : ");
            pos = user_input.nextInt();
        }while(pos<=0 || pos>len);

    }
    
    public static void printResult(char result){
        System.out.println(result + " is at position " + pos);
    }
}
