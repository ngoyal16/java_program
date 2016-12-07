import java.util.Scanner;

public class CountChar{
    static Scanner user_input = new Scanner( System.in );
    
    static String str;
    static char letter;
    
    public static void main(String []args){
        getInput(); // get the input from user
        
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
        
        printResult(count); // print the result
    }
    
    public static void getInput(){
        System.out.print("Please Enter String : ");
        str = user_input.nextLine().toLowerCase();
        
        System.out.print("Please Enter Charter you would like to fine : ");
        letter = user_input.next().trim().toLowerCase().charAt(0);
    }
    
    public static void printResult(int result){
        if(result != 0){
            System.out.println("charater found " + result + " times");   
        }else{
            System.out.println("String won't have the charter you looking for");
        }
    }
}
