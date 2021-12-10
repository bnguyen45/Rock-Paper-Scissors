import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        String vsChoice = "";


        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Would you like to play vs another player or computer?");
        vsChoice = scanner.next();

        if (vsChoice.equalsIgnoreCase("player")) {
            Player player1 = new Player();
            Player player2 = new Player();

            player1.setName("Player1");
            player2.setName("Player2");

            System.out.println(player1.getName() + " Choose between `Rock`, `Paper`, or `Scissors`");
            choice = scanner.next();

            while (!"Rock".equalsIgnoreCase(choice) && !"Paper".equalsIgnoreCase(choice) && !"Scissors".equalsIgnoreCase(choice)) {
                System.out.println("Please enter a valid choice");
                choice = scanner.next();
            }

            player1.setChoice(choice);

            System.out.println(player2.getName() + " Choose between `Rock`, `Paper`, or `Scissors`");
            choice = scanner.next();

            while (!"Rock".equalsIgnoreCase(choice) && !"Paper".equalsIgnoreCase(choice) && !"Scissors".equalsIgnoreCase(choice)) {
                System.out.println("Please enter a valid choice");
                choice = scanner.next();
            }
            player2.setChoice(choice);

            System.out.println(player1.getName() + " chose " + player1.getChoice());
            System.out.println(player2.getName() + " chose " + player2.getChoice());

            Player winner = new GameLogic().start(player1, player2);

            if (winner == player1) {
                player1.incrementScore();

                System.out.println("Player 1 Score: " + player1.getScore());

            } else if (winner == player2) {
                player2.incrementScore();
                System.out.println("Player 2 Score: " + player2.getScore());
            }
        } else {

            Player player1 = new Player();
            Computer computer = new Computer();

            player1.setName("Player1");
            computer.setName("Computer");

            System.out.println(player1.getName() + " Choose between `Rock`, `Paper`, or `Scissors`");
            choice = scanner.next();

            while (!"Rock".equalsIgnoreCase(choice) && !"Paper".equalsIgnoreCase(choice) && !"Scissors".equalsIgnoreCase(choice)) {
                System.out.println("Please enter a valid choice");
                choice = scanner.next();
            }

            player1.setChoice(choice);
            computer.setChoice();

            System.out.println(player1.getName() + " chose " + player1.getChoice());
            System.out.println(computer.getName() + " chose " + computer.getChoice());

            Player winner = new GameLogic().start(player1, computer);

            if (winner == player1) {
                player1.incrementScore();

                System.out.println("Player 1 Score: " + player1.getScore());

            } else if (winner == computer) {
                computer.incrementScore();
                System.out.println("Computer Score: " + computer.getScore());
            }


        }


    }
}

