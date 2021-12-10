public class GameLogic {

    public Player start(Player player1, Player player2) {
        String choice1 = player1.getChoice();
        String choice2 = player2.getChoice();

        Player winner = null;
        if (choice1.equalsIgnoreCase("Rock") && choice2.equalsIgnoreCase("Scissors")
                || choice1.equalsIgnoreCase("Paper") && choice2.equalsIgnoreCase("Rock")
                || choice1.equalsIgnoreCase("Scissors") && choice2.equalsIgnoreCase("Paper")) {
            winner = player1;
            System.out.println(winner.getName() + " wins the game!");
        } else if (player1.getChoice().equalsIgnoreCase(player2.getChoice())) {
            System.out.println("Tie Game");
        } else {
            winner = player2;
            System.out.println(winner.getName() + " wins the game!");
        }
        return winner;
    }

}
