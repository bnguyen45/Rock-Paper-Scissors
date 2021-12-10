public class GameLogic {

    public Player start(Player player1, Player player2){
        String choice1 = player1.getChoice();
        String choice2 = player2.getChoice();

        Player winner;
        if (choice1.equalsIgnoreCase("Rock") && choice2.equalsIgnoreCase("Scissors")
        || choice1.equalsIgnoreCase("Paper") && choice2.equalsIgnoreCase("Rock")
        || choice1.equalsIgnoreCase("Scissors") && choice2.equalsIgnoreCase("Paper")){
            winner = player1;
        }else{
            winner = player2;
        }
        return winner;
    }

}
