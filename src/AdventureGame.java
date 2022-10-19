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
                    System.out.println("You move the leaves out of the way and BOOM, a lion leaps at you and eats you up. Good Night. See you next time!");
                }
            } else if (commandN.equals("n")) {

            } else if (commandN.equals("s")) {

            } else if (commandN.equals("w")) {

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
            }
        } else if (command.equals("e")) {

        } else if (command.equals("w")) {

        } else {
            System.out.println("End of adventure!");
        }
    }
}
