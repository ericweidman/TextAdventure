import java.util.ArrayList;

/**
 * Created by ericweidman on 2/3/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList();


    public void chooseName() {
        System.out.println("What is your name?");
        // alt + enter import
        name = Game.nextLine();
        System.out.println("Welcome, " + name + ".");
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose  your weapon [sword/mace]");
        weapon = Game.nextLine();

        if (weapon.equalsIgnoreCase("sword")) {
            System.out.println("A sword if a fine choice!");

        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("A mace is a fine choice!");
        } else {
            //Exceptions must be documented
            //alt + enter
            throw new Exception("Invalid weapon!");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [forest/tunnel]");
        location = Game.nextLine();

        if (location.equalsIgnoreCase("forest")) {
            System.out.println("Entering forest...");
        } else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering tunnel");
        } else {
            throw new Exception("Invalid location!");
        }

    }

    public void findItem(String item) {
        System.out.println("You found a " + item + "! Pick it up? [y/n]");
        String answer = Game.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println("You picked up an item!");

        }
    }
}
