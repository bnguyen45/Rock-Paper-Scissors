import java.util.Random;

public class Computer extends Player {

    private String choice;
    private int score;


    public String getChoice() {
        return choice;
    }

    public void setChoice() {
        String[] arr = {"Rock", "Paper", "Scissors"};

        int rnd = new Random().nextInt(arr.length);
        choice = arr[rnd];

    }


}



