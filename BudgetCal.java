import java.util.Scanner;

public class BudgetCal{
    public static void main(String []args){
        Scanner user_input = new Scanner( System.in );
        System.out.print("Please Enter the budget of the month : ");
        double budget = Double.parseDouble(user_input.nextLine());
        double expense = 0.0;
    
        System.out.println("Please Enter the expese of the month line by line when done press blank enter");
        String temp = "";
        while(true){
            temp = user_input.nextLine();
            if(temp.isEmpty()){
                break;
            }
            
            expense += Double.parseDouble(temp);
        }
        
        System.out.println("Your Total Expense is : " + expense);
        if(budget > expense){
            System.out.println("Your are under the budget");
        }else if(budget < expense){
            System.out.println("Your are over the budget");
        }else{
            System.out.println("You save noting");
        }
    }
}