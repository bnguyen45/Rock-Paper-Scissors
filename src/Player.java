public class Player {
    private String name;
    private String choice;
    private int score;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        this.score++;
    }

}
