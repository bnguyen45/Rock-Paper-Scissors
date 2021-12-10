import java.util.Random;

public class Computer extends Player {

private String choice;
private int score=0;


public String getChoice(){
    return setChoice();
}
public String setChoice(){
    String[] arr={"Rock","Paper","Scissors"};

    int rnd = new Random().nextInt(arr.length);
    return arr[rnd];
}









}



