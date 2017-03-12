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
    // create critical rate property
    double critRate;
    // create critical damage property
    double critDMG;

    //set constructor
    public Character(String name, String type){
        this.name = name;
        this.type = type;
        if(type.equals("Cyclops")){
            this.health = 1250;
            this.power = 75;
            this.dodgePercent = 20.0/100.0;
            this.critRate = 15.0/100.0;
            this.critDMG = 50.0/100.0;
        }
        if(type.equals("DodgeBall Champ")){
            this.health = 300;
            this.power = 30;
            this.dodgePercent = 70.0/100.0;
            this.critRate = 40.0/100.0;
            this.critDMG = 125.0/100.0;
        }
        if(type.equals("Wizard")) {
            this.health = 750;
            this.power = 100;
            this.dodgePercent = 25.0/100.0;
            this.critRate = 25.0/100.0;
            this.critDMG = 50.0/100.0;
        }
        if(type.equals("Flame Mage")){
            this.health = 850;
            this.power = 90;
            this.dodgePercent = 20.0/100;
            this.critRate = 20.0/100.0;
            this.critDMG = 45.0/100.0;
        }

    }

    // attack method
    public void attack(Character character){
        double critFinal; // used to calculate the amount of damage to add to the power
        System.out.println(character.name +" attacks " + name);
        if(setDodge()){ //check if character dodged. The damage is nullifyed.
            health = health;
            System.out.println(name+" dodged");
        }
        else if(setCrit()){ //To check if character landed a critical hit
            critFinal = character.power * character.critDMG;
            health = health - (character.power + critFinal);
            System.out.println(character.name+ " landed a critical hit!");
        }
        else {
            health = health - character.power;
        }
        System.out.println(name+" health is: " + health);



    }
    //dodge method
    public boolean setDodge() {
        Random ran = new Random();


        double randomNum = ran.nextDouble();
        boolean dodge = false;

        /* if statement to check to see if the dodgePercent is greater than or equal to the random number.
           Since the values of the randomNUm is between 0 and 1, the higher the dodge percent
           the higher the chance to dodge.
        */
        if (dodgePercent >= randomNum) {
            dodge = true;

        }
        return dodge;
    }
    // critical hit method
    public boolean setCrit(){
        Random ran = new Random();

        double randomNum = ran.nextDouble();
        boolean crit = false;
        // Same calculation in the setDodge method is applied here.
        if (critRate >= randomNum) {
            crit = true;
        }
        return crit;
    }
    // toString method
    public String toString(){
        String status = "The "+ type+ " "+name+" has " +health+" health and deals "+ power+ " damage on each attack.";
        return status;
    }
}








































