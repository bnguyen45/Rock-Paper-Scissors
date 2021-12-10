import java.util.Random;

public class Computer extends Player {

private String choice;
private int score=0;


public String getChoice(){
    return choice;
}

public void setChoice(){
   int[] choiceArray ={1, 2, 3};
    int randomChoice = new Random().nextInt(choiceArray.length);
    if (randomChoice == choiceArray[0]){
        choice = "Rock";
    }else if(randomChoice == choiceArray[1]){
        choice = "Paper";
    }else{
        choice = "Scissors";
    }




}


}
