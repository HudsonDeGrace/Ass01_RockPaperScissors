import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String trash = "";
        String ifContinue = "";
        boolean done = false;
        boolean terminate = false; // Ends program

        do{
            do {
                System.out.print("Player A's turn choose rock, paper, or scissors [R,P,S or r,p,s] ");
                playerA = in.nextLine();
                if (playerA.equals("R") || playerA.equals("r")) {
                    playerA = "Rock";
                    done = true;
                } else if(playerA.equals("P") || playerA.equals("p")){
                    playerA = "Paper";
                    done = true;
                } else if(playerA.equals("S") || playerA.equals("s")){
                    playerA = "Scissors";
                    done = true;
                } else{
                    System.out.println("You entered " + playerA);
                    System.out.println("Please enter R or r for rock, P or p for paper, and S or s for scissors!");
                }
            }while(!done);

            done = false;

            do{
                System.out.print("Player B's turn choose rock, paper, or scissors [R,P,S or r,p,s] ");
                playerB = in.nextLine();
                if (playerB.equals("R") || playerB.equals("r")) {
                    playerB = "Rock";
                    done = true;
                } else if(playerB.equals("P") || playerB.equals("p")){
                    playerB = "Paper";
                    done = true;
                } else if(playerB.equals("S") || playerB.equals("s")){
                    playerB = "Scissors";
                    done = true;
                } else{
                    System.out.println("You entered " + playerB);
                    System.out.println("Please enter R or r for rock, P or p for paper, and S or s for scissors!");
                }
            }while(!done);

            if(playerA.equals(playerB)){
                System.out.println(playerA + " vs " + playerB + "! It's a tie!");
            } else if(playerA.equals("Rock")){
                if(playerB.equals("Scissors")){
                    System.out.println("Rock breaks Scissors! Player A wins!");
                } else{
                    System.out.println("Paper covers Rock! Player B wins!");
                }
            } else if(playerA.equals("Paper")){
                if(playerB.equals("Rock")){
                    System.out.println("Paper covers Rock! Player A wins!");
                } else{
                    System.out.println("Scissors cuts Paper! Player B wins!");
                }
            } else if(playerA.equals("Scissors")){
                if(playerB.equals("Paper")){
                    System.out.println("Scissors cuts Paper! Player A wins!");
                } else{
                    System.out.println("Rock breaks Scissors! Player B wins!");
                }
            }
            do{
                System.out.print("Do you want to continue? [y or n] ");
                ifContinue = in.nextLine();
                if(ifContinue.equals("y")){
                    done = true;
                } else if(ifContinue.equals("n")){
                    done = true;
                    terminate = true;
                } else{
                    System.out.println("Please input either y for yes or n for no.");
                    done = false;
                }
            }while(!done);
        }while(!terminate);
    }
}