public class Player extends GameStart {
   private String name;
    private String choice;

   public Player(String name, String choice){
        this.name=name;
        this.choice=choice;
    }

    public void setName(String name){
       this.name=name;
    }
    public String getName(){
       return name;
    }

    public String getChoice(){
       return choice;
    }

    public void setChoice(String choice){
       this.choice=choice;
    }




}
