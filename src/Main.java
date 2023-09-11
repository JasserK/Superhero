import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();

        System.out.println("-------------------------------------");
        System.out.println("Welcome to the Superhero Universe!");
        System.out.print("\nWould you like to create a Superhero? [yes/no]: ");
        String creationOfSuperhero = scanner.next().toLowerCase();

        if (creationOfSuperhero.equals("yes")) {
            System.out.println("\nYou have chosen to create a Superhero");

            System.out.print("What would you like your Superhero name to be?: ");
            String mySuperHeroName = scanner.next();

            System.out.print("What about your civilian name?: ");
            String myName = scanner.next();

            System.out.print("What super power would you like to have?: ");
            String mySuperPower = scanner.next();

            System.out.print("How old is your Superhero?: ");
            int myAge = scanner.nextInt();

            System.out.print("What's your Superhero's power level?: ");
            int myStrength = scanner.nextInt();

            System.out.print("Is your Superhero a human? [yes/no]: ");
            String amIHuman = scanner.next().toLowerCase();

            Superhero superHero = new Superhero(mySuperHeroName, myName, mySuperPower, myAge, amIHuman, myStrength);
            System.out.println();

            if (amIHuman.equals("yes")) {
                System.out.println("Your Superhero is a human? Interesting...");
                System.out.println();
                System.out.println(superHero);
            } else if (amIHuman.equals("no")) {
                System.out.println("Not a human? Spooky");
                System.out.println();
                System.out.println(superHero);
            } else {
                System.out.println("Oh noooooo system is malfunctioning");
            }

        } else {
            System.out.println("\nOh noooooo system is malfunctioning");
        }
    }
}
