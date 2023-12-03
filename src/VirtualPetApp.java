import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Virtual Pet!!! Your virtual furry best friend is so excited to meet you!");
        
        System.out.println("	_     /)---(\\          /~~~\\	");
        System.out.println("	\\\\   (/ . . \\)        /  .. \\	");
        System.out.println("	 \\\\__)-\\(*)/         (_,\\  |_)	");
        System.out.println("	 \\_       (_         /   \\@/    /^^^\\	");
        System.out.println("	 (___/-(____) _     /      \\   / . . \\	");
        System.out.println("	              \\\\   /  `    |   V\\ Y /V	");
        System.out.println("	               \\\\/  \\   | _\\    / - \\	");
        System.out.println("	                \\   /__'|| \\\\_  |    \\	");
        System.out.println("	                 \\_____)|_).\\_).||(__V	");

        System.out.println("What would you like to name your pet?");
        String petName = userInput.nextLine();
        VirtualPet usersPet = new VirtualPet(petName);
        System.out.println();
        System.out.println("That's such a cute name! ");
        usersPet.displayPetStatus();

        Boolean continuePlaying = true;
        while (continuePlaying){
            System.out.println("How would you like to interact with "+usersPet.name+"? Select from the following menu: ");
            System.out.println("(1) Feed "+usersPet.name);
            System.out.println("(2) Give "+usersPet.name +" a bowl of water");
            System.out.println("(3) Play with "+usersPet.name);
            System.out.println("(4) Send "+usersPet.name+" to bed");
            System.out.println("(5) Exit Game");
            System.out.print("Select an option (1-5): ");

            int userSelection = userInput.nextInt();
            switch (userSelection) {
                case 1:
                    usersPet.feedPet();
                    usersPet.tick();
                    break;
                case 2:
                    usersPet.givePetWater();
                    usersPet.tick();
                    break;
                case 3:
                    usersPet.playWithPet();
                    usersPet.tick();
                    break;
                case 4:
                    usersPet.napTime();
                    usersPet.tick();
                    break;
                case 5:
                    continuePlaying = false;
                    System.out.println("You've selected to exit the game. "+usersPet.name+" will miss you! Hasta Luego!");
                    break;
                default:
                    break;
            }
        }

        userInput.close();
    }
}
