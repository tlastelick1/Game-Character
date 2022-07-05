/**
 * @author Trevor Lastelick
 * The character program implements an application that prompts the user for
 * various information needed to fill out every mv (member variable) of the class.
 * There are four string mv's and 6 integer mv's. It then neatly displays all the 
 * information given to the prompts next to its corresponding attribute. Below
 * that, it shows the total of all the integer attributes added together. 
 */
package lastelick_hw1;
import java.util.Scanner;

public class main {
    
// This class displays a prompt of available character classes to choose from
public static void displayClasses()
{
    System.out.printf("Available Character Classes: \n%s%s%s", "***********\n",
            "Fighter\nPaladin\nRanger\nWizard\nThief\n", "***********");
}
    /**
     * This is the main method which implements the class character. It also
     * makes use of that class's methods addTotal(int, int, int, int, int, int)
     * and displayTotal() (see class documentation for details. Outside of 
     * character class it utilizes the displayClasses() method which displays
     * a prompt. 
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        
    displayClasses(); // show options for classes
    
    // new Scanner object (inputStr) to accept input from prompts
    Scanner inputStr = new Scanner (System.in); 
    
    // prompt for the class
    System.out.println("\nWhat character class: ");
    String characterClass = inputStr.nextLine();
    
    // prompt for the name
    System.out.println("What is the character name: ");
    String name = inputStr.nextLine();
    
    // prompt for the gender
    System.out.println("What gender: ");
    String gender = inputStr.nextLine();
    
    // prompt for the race
    System.out.println("What race (Human, Elf, or Dwarf): ");
    String race = inputStr.nextLine();
    
    // prompt for strength
    System.out.println("How much strength: ");
    int str = inputStr.nextInt();
    
    // prompt for dexterity
    System.out.println("How much dexterity: ");
    int dex = inputStr.nextInt();
    
    // prompt for constitution
    System.out.println("How much constitution: ");
    int con = inputStr.nextInt();
    
    // prompt for intellect
    System.out.println("How much intellect: ");
    int intel = inputStr.nextInt();
    
    // prompt for wisdom
    System.out.println("How much wisdom: ");
    int wis = inputStr.nextInt();
    
    // prompt for charisma
    System.out.println("How much charisma: ");
    int cha = inputStr.nextInt();
    
    // create an object of class character
    // input as parameters all data from the prompts
    character rpg = new character(name, gender, characterClass, race,
    str, dex, con, intel, wis, cha);
    
    // display the string attributes
    System.out.printf("\nName: %s\nGender: %s\nCharacterClass: %s\nRace: %s\n", 
    rpg.getName(), rpg.getGender(), rpg.getCharacterClass(), rpg.getRace());

    // display the integer attributes 
    System.out.printf("STR: %s\nDEX: %s\nCON: %s\nINT: %s\nWIS: %s\nCHA: %s\n", 
        rpg.getStr(), rpg.getDex(), rpg.getCon(), rpg.getInt(), rpg.getWis(), 
        rpg.getCha());
    
    // add together all the parameters (every integer value)
    int total = rpg.addTotal(str, dex, con, intel, wis, cha);
    
    // display the total value of all the integer attributes
    rpg.displayTotal(total);
   
    } // end main  
}// end entire program