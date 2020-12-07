package wordgamehw;

import java.util.*;

public class WordGameHW {

    public static String[] weapons = {"Dagger", "Sword", "Mace", "Spear", "Club", "Axe"};
    public static String userInput;
    public static boolean loop = true;
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    public static String randomW = weapons[random.nextInt(6)];

    public static void main(String[] args) {
        System.out.println("This is the start of your mission.\nYou have to kill the dragon.\nAlong the way there will be choices you make that impact the outcome of the game.");
        System.out.println("Type Either \"1\" or \"2\" to make your choices.\nChoose wisely and Good Luck!");
        System.out.println("\nYour random weapon you have been given for this mission is a " + randomW);
        start();

        if (userInput.equals("1")) {
            kill();
            paths();
        } else {
            speak();
            paths();
        }
        if (userInput.equals("1")) {
            mountain();
            if (userInput.equals("1")) {
                System.out.println("You successfully climb the rocky, icy path that hasn't been used for years and reach the top of the mountain. You see the dragon's lair. You descend the mountain and go on the path towards the dragon's lair.");
                dragonPath();
            } else {
                System.out.println("You try and fight the trolls with your " + randomW + " however you are unsuccessful as they pound you with their clubs crushing your skull.\nYou are dead this is the end of your mission.");
                System.exit(0);
            }
        } else {
            woods();
            if (userInput.equals("1")) {
                System.out.println("You knock on the door. You hear the foosteps of the person coming to open the door. The person opens the door and a evil witch appears. She quickly waves her wand and turns you into a frog and boils you alive.\nYou are dead this is the end of your mission.");
                System.exit(0);
            } else {
                System.out.println("You wander through the forest slowly becoming more and more exhausted. The creepy noises start to make youy go crazy however you are relived once you see a large beam of light where the woods end.\nAfter you exit the woods there is a path to the dragon's lair. You start to follow this path.");
                dragonPath();
            }
        }
        if (userInput.equals("1")) {
            charge();
            if (userInput.equals("1")){
                System.out.println("You blind the dragon and it flies away. You cant chase the dragon as you are already exhausted. Your mission was partly successful");
                Victory win = new Victory();
                
                win.setSize(1200,800);
                win.setVisible(true);
            }else{
                System.out.println("It breathes fire as you try and hit it in the mouth and you are burnt to death.\nYou are dead this is the end of your mission.");
                youDied die = new youDied();
                
                die.setSize(375,300);
                die.setVisible(true);
            }
        } else {
            counter();
            if (userInput.equals("1")){
                System.out.println("You hit the dragon round the face as it attemps to breathe fire on you however you break his skull and the hot liquid fire seeps through his skin. You killed the dragon and your mission was successful.You are now known a hero forevr. NICE WORK HERO!!");
                Victory win = new Victory();
                
                win.setSize(1200,800);
                win.setVisible(true);
            }else{
                System.out.println("You slice open the dragons stomach. The hot liquid fire pours over you from out of the dragons stomach and it scalds your body. You slayed the dragon and are known a hero however eventually you die a very painful death from the burns");
                Victory win = new Victory();
                
                win.setSize(1200,800);
                win.setVisible(true);
                youDied die = new youDied();
                
                die.setSize(375,300);
                die.setVisible(true);
            }
        }
    }

    public static void start() {

        System.out.println("");
        System.out.println("You are walking along a path. A hooded figure approaches.");
        System.out.println("What do you want to do:"
                + "\n1. Kill him with your " + randomW
                + "\n2. Speak to him.");
        loop();
    }

    public static void kill() {
        System.out.println("You engage in combat. He tries to draw his dagger however you execute him swiftly before he has a chance to strike back");
        System.out.println("");

    }

    public static void speak() {

        System.out.println("");
        System.out.println("The hooded figure warns you of the dangerous path ahead and sprints off");
        System.out.println("You continue on your journey");

    }

    public static void paths() {
        System.out.println("As you walk you find a split path.");
        System.out.println("What do you want to do:"
                + "\n1. Go through the mountain path."
                + "\n2. Go throught the dark woods.");
        loop();
    }

    public static void mountain() {

        System.out.println("");
        System.out.println("The path is icy and steep. You can see movement ahead. As you approach you figure out you are walking towards ice trolls. ");
        System.out.println("What do you want to do:"
                + "\n1. Climb a steeper rocky path."
                + "\n2. Fight the ice trolls.");
        loop();
    }

    public static void woods() {

        System.out.println("The dark mysterious trees tower over you intimidating you. There is a small hut lit up by the flames of a fire.");
        System.out.println("What do you want to do:"
                + "\n1. Knock on the hut's door."
                + "\n2. Continue walking through the woods in search of the dragon.");
        loop();
    }

    public static void dragonPath() {
        System.out.println("");
        System.out.println("You have walked along the old cobblestone path and you are standing outside the old mining place that has been overrun by a dragon.");
        System.out.println("You enter his lair. He is sleeping infront of you guarding the entrance. You think to yourself now would be a great time to strike.");
        System.out.println("SUDDENLY The huge beast awakes from the smell of fresh human blood.");
        System.out.println("You hold your " + randomW + " tight and prepare for combat.");
        System.out.println("What do you want to do:"
                + "\n1. Charge at the dragon."
                + "\n2. Wait for the dragon to attack so you can counter attack.");
        loop();
    }

    public static void charge() {
        System.out.println("You charge at the dragon. The dragon swipes his arm across the floor and trips you up. You stand back up and swing your sword ripping a chunck of flesh from his chest. However you are injured from the fall.");
        System.out.println("What do you want to do:"
                + "\n1. Hit it in the eye."
                + "\n2. Hit it in the mouth.");
        loop();
    }

    public static void counter() {
        System.out.println("You wait for it to strike. The dragon tries to claw you however you dodge his claw and slice it off.");
        System.out.println("What do you want to do:"
                + "\n1. Run up the dragons arm and hit its head."
                + "\n2. Run under the dragon and slice his stomach open.");
        loop();
    }

    public static void loop() {
        while (loop == true) {
            userInput = input.next();
            if (userInput.equals("1") || userInput.equals("2")) {
                loop = false;
            } else {
                System.out.println("You entered an invalid input. Please enter a valid input (\"1\" or \"2\").");
            }

        }
        loop = true;
    }
}
