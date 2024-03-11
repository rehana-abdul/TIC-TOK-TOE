//import java.util.Scanner;

import board.Board;
import game.Game;
import player.Player;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("FirstProject >>> TIC TAC TOE");
        Board b=new Board(3,'-');
        
        //Scanner sc=new Scanner(System.in);
       // String p1Name=sc.nextLine();
        //char p1Symbol=sc.nextLine().charAt(0);

        Player p1=new Player();
        p1.setPlayerNameAndSymbol("Alexa",'X');
        p1.getPlayerNameAndSymbol();

         //String p2Name=sc.nextLine();
        //char p2Symbol=sc.nextLine().charAt(0);
       
        Player p2=new Player();
        p2.setPlayerNameAndSymbol("Siri",'O');
        p2.getPlayerNameAndSymbol();

       // p1.changeSymbol('0');
       // b.setDefaultSymbol('@');
       
       Game game=new Game(new Player[] {p1,p2},b);
       game.play();
    }
}
