import java.util.Random;
import java.util.Scanner;

public class Character {

    // Create a property to hold the character's name
    String name;
    // Create a property to hold the character's type.
    String type;
    // create a property to hold the character's health.
    double health;
    // create the power property
    double power;
    // create dodgePercent property
    double dodgePercent;


    public Character(String name, String type){
        this.name = name;
        this.type = type;
        if(type.equals("Cyclops")){
            this.health = 1250;
            this.power = 75;
            this.dodgePercent = 20.0/100.0;
        }
        if(type.equals("DodgeBall Champ")){
            this.health = 300;
            this.power = 20;
            this.dodgePercent = 70.0/100.0;

        }
        if(type.equals("Wizard")) {
            this.health = 750;
            this.power = 100;
            this.dodgePercent = 25.0/100.0;
        }
        if(type.equals("Flame Mage")){
            this.health = 850;
            this.power = 90;
            this.dodgePercent = 20.0/100;
        }

    }





    public String toString(){
        String status = "The "+ type+ " "+name+" has " +health+" health and deals "+ power+ " damage on each attack.";
        return status;
    }
}








































