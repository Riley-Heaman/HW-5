import java.util.Scanner;

//Riley Heaman
//CIS 219 Tue, Thur @3:30
//Homework 5: Switch
public class Main{
    public static void main(String args[]){
        //Initiate a new scanner for user input
        Scanner input = new Scanner(System.in);
        //Ask for what we are looking for; A D&D class
        System.out.println("Pick a D&D class: Cleric, Fighter, Warlock, Monk, Rogue. \n(It is case sensitive. **Pick Rogue**)");
        //Assign the input to a sting var.
        String adventureClass = input.nextLine();
        //Close the scanner.
        input.close();
        //Check which choice was given. ** Error checking isn't accounted for **
        switch(adventureClass){
            case "Cleric":
                System.out.println("Your D&D class is Cleric");
                break;
            
            case "Fighter":
                System.out.println("Your D&D class is Fighter");
                break;

            case "Warlock":
                System.out.println("Your D&D class is Warlock");
                break;

            case "Monk":
                System.out.println("Your D&D class is Monk");
                break;

            case "Rogue":
                System.out.println("Your D&D class is Rogue");
                break;
        }       
    }
}