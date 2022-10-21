import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();
        int num;

        if (command.equals("n")) {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            System.out.println("Should we explore(n), check what's rustling(e), head back to the island(s), or examine the exotic plants(w)?");
            String commandN = scan.nextLine();
            num = (int) (Math.random()*8 + 1);
            if (commandN.equals("e")) {
                if (num == 1) {
                    System.out.println("You move the leaves out of your way and you are presented with a... with a dragon?? WOWWWW, this is your free ticket home!! Enjoy your ride!");
                } else {
                    System.out.println("You move the leaves out of the way and BOOM, a tiger leaps at you and eats you up. Good Night. See you next time!");
                }
            } else if (commandN.equals("n")) {
                System.out.println("You find a humungous wild buffalo and suddenly an axe appears in your hand. I think this is a sign to go eat up eh?");
            } else if (commandN.equals("s")) {
                System.out.println("pfft boring, I can no longer narrate any further cause I died of boredom watching you go back");
            } else if (commandN.equals("w")) {
                System.out.println("Is that juice leaking out of those plants??? It looks so appetizing so you proceed to lick it. You feel refreshed but shortly after you fall into permanent sleep. Unlucky.");
            } else {
                System.out.println("Invalid direction");
            }

        } else if (command.equals("s")) {
            System.out.println("You get ready and dive into the icy cold waters\nDo you want to keep going (s) or head back (n)?");
            String commandS = scan.nextLine();
            if (commandS.equals("s")) {
                num = (int) (Math.random() * 4 + 1);
                if (num == 1) {
                    System.out.println("Wow, you really are something. You pushed through and endured the icy cold waters of the Atlantic Ocean. Congratulations, welcome home!");
                } else {
                    System.out.println("Aw, better luck next time. You couldn't handle the freezing water and died of hypothermia.");
                }
            } else {
                System.out.println("*Yawn* boring, you took so long that a shark came an ate you up whole.");
            }
        } else if (command.equals("e")) {
            System.out.println("Wow what an interesting shack!! Would you like to go in(e) or retreat(w)");
            String commandE = scan.nextLine();
            num = (int) (Math.random()*10 + 1);
            if (commandE.equals("e")) {
                if (num == 1) {
                    System.out.println("Unlucky, you walked in and something heavy just hit you in the head and you never woke up");
                } else {
                    System.out.println("Wow, there looks like there is a lot of good materials in here that we should use to try and go back home. Take advantage!!");
                }
            } else {
                if (num <= 5) {
                    System.out.println("Woah watch your step, you almost fell down the stairs due to your clumsiness");
                } else {
                    System.out.println("Woops, you forgot you climbed up stairs and you tripped and hit your head on a rock. Better luck next time");
                }
            }
        } else if (command.equals("w")) {
            System.out.println("Why did you type in w? There was nothing listed for w???? \n\n\n\n\n\n\n Well lucky you there is a portal right before your eyes. Do you enter(w) or not(e)");
            String commandW = scan.nextLine();
            num = (int) (Math.random()*3 + 1);
            if (commandW.equals("w")) {
                if (num == 1) {
                    System.out.println("You start to disappear into thin air and then wooooosh...You are now lying down on your bed, nice.");
                } else {
                    System.out.println("Welp, you just appeared at the edge of the world. Looks like you won't be seeing anything for a while");
                }
            } else {
                System.out.println("Man you missed your shot at instantly being teleported into your house. Im shaking my head :(");
            }
        } else {
            System.out.println("End of adventure!");
        }
    }
}
