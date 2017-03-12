import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random ran = new Random();
        // Create scanner for input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your character");
        String name = scan.nextLine();
        System.out.println("Enter the type of your character");
        String type = scan.nextLine();
        // Random number used for array
        int selection = ran.nextInt(4);
        // Array to hold types
        String types[]= {"Wizard", "Flame Mage", "DodgeBall Champ", "Cyclops"};
        // Give the AI a random type
        String AItype = types[selection];
        //Create player instance

        Character player1 = new Character(name, type);


        // Create a new instance of the Character class named AI.
        Character AI = new Character( "AI", AItype);

        System.out.println(player1);

        System.out.println(AI);

        //check health and then attack
        while(player1.health > 0 || AI.health > 0) {
            player1.attack(AI);
            if(player1.health <= 0){
                System.out.println("You Lose");
                break;
            }
            AI.attack(player1);
            if(AI.health <= 0){
                System.out.println("AI has fallen.You win");
                break;
            }

        }

        // Print the player to the console.
        System.out.println(player1);
        // Print the AI to the console.
        System.out.println(AI);
    }
}


