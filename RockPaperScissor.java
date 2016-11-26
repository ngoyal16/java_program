import java.util.Scanner;

public class RockPaperScissor{
    public static void main(String []args){
        Scanner user_input = new Scanner( System.in );
        String output[] = {"rock", "paper", "scissors"};
        boolean isContinue = true;
        
        do{
            int computerTemp = (1 + (int)(Math.random() * ((3-1)+1)));
            String result = "";
            
            System.out.print("Please Enter the your choice (1-rock, 2-paper, 3-scissors): ");
            int personTemp = user_input.nextInt();
            if(personTemp < 1 || personTemp > 3){
                result = "You have enter wrong choice, Try Again!";
            }else{
                System.out.println("Computer Choose:" + output[computerTemp-1] + ", You Choose:" + output[personTemp-1]);
                if(computerTemp == personTemp){
                    result = "Game Tie, Play again!";
                }else{
                    switch(computerTemp){
                        case 1:
                            result = (personTemp == 2) ? "Paper eats rock. You Win!!" : "Rock crushes scissors. You Loss!!";
                            break;
                            
                        case 2:
                            result = (personTemp == 3) ? "Scissor cuts paper. You Win!!" : "Paper eats rock. You Loss!!";
                            break;
                        
                        case 3:
                            result = (personTemp == 1) ? "Rock crushes scissors. You Win!!" : "Scissor cuts paper. You Loss!!";
                            break;
                    }
                    isContinue = false; // comment this line for infinity play
                }
            }
            System.out.println(result);
        }while(isContinue);
    }
}