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

            if (player1.getChoice().equalsIgnoreCase(player2.getChoice())) {
                System.out.println("Game is a draw!");
            } else {
                Player winner = new GameLogic().start(player1, player2);
                System.out.println(winner.getName() + " wins the game!");

                if (winner == player1) {
                    player1.incrementScore();

                    System.out.println("Player 1 Score: " + player1.getScore());

                } else {
                    player2.incrementScore();
                    System.out.println("Player 2 Score: " + player2.getScore());
                }
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

            System.out.println(computer.getName() + " chose " + computer.getChoice());


            if (player1.getChoice().equalsIgnoreCase(computer.getChoice())) {
                System.out.println("Game is a draw!");
            } else {
                Player winner = new GameLogic().start(player1, computer);
                System.out.println(winner.getName() + " wins the game!");

                if (winner == player1) {
                    player1.incrementScore();

                    System.out.println("Player 1 Score: " + player1.getScore());

                } else {
                    computer.incrementScore();
                    System.out.println("Computer Score: " + computer.getScore());
                }


            }


        }
    }
}
