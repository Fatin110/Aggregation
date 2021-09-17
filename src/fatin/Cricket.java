package fatin;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket (String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display(){
        System.out.println("Match Type is: "+matchType);
        System.out.println("This is "+over+" overs match");
        System.out.println("Name of the Player: "+player.playerName);
        System.out.println("Jersey number is: "+player.jerseyNumber);
    }
}
        /* Name: Fatin Ishmam Mazumdar
           ID  : 1912020264
           Section: F
           Email : ishmam110@gmail.com or cse_1912020264@lus.ac.bd
           Date : 14/07/2021
        */