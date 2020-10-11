
import java.util.Scanner;//imports scanner input

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaji
 */
public class Sales {//create public class method of Sales

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//create the main method
        Scanner in = new Scanner(System.in);//enable scanner input to ask the user
        int muffinnumber;//initialize the integer for muffinnumber
        int quantity;//initialize the integer for quantity
        double quantityprice = 0;//add double variable for quantityprice = 0
        
        String menu = "Muffin Menu\n"+
                "1.Blueberry muffin\n"+
                "2.Chocolate chip muffin\n"+
                "3.Banana muffin";
        //create the string for the menu of the muffin
        
        System.out.println(menu);
        //print the statement to display the menu
        System.out.println("******************************************");
        System.out.print("Enter muffin number (1-3 or 0 to stop): ");
        //print the statement to ask the user to enter the input for muffin number
        muffinnumber = in.nextInt();
        //enable the input for muffinnumber to ask the user to enter it
        
        while(muffinnumber!=0){//add sentinel controlled loop if muffin number is not equal to 0
            if(muffinnumber>=1 && muffinnumber<=3){
                //add if statement if the muffin number is greater than 1 and less than 3
        
            System.out.print("Enter quantity sold: ");
            //print the statement to ask the user to enter the input for quantity
            quantity = in.nextInt();
            //enable the input for quantity to ask the user to enter the input
                
                switch(muffinnumber){//add switch statement for muffin number options
                    case 1://add case 1 for first option
                    quantityprice += quantity*2.98;
                    //calculate the price for first option with quantity
                    break;//add break to calculate total price
                    case 2://add case 2 for second option
                    quantityprice += quantity*4.50;
                    //calculate the price for 2nd option with quantity
                    break;//add break to calculate total price
                    case 3://add case 3 for third option
                    quantityprice += quantity*9.98;
                    //calculate the price for 3rd option with quantity
                    break;//add break to calculate total price
                }
            }
            else{//add else statement to check if muffin number is above 3
                System.out.println("Muffin number must be between 1 and 3 or 0 to stop");
                //print the statement to display after user enters above 3
            }
            System.out.print("Enter muffin number (1-3 or 0 to stop): ");
            //print the statement to ask the user to enter the input for muffinnumber
            muffinnumber = in.nextInt();
            //enable the input for muffinnumber to ask the user to enter it
        }
        System.out.printf("Total retail value of all muffins sold is: $%.2f\n", quantityprice);
        //print the statement that displays the total price of the muffins sold
    }
}