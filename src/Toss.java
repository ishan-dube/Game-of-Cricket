import java.util.*;
import Player.Player;
public class Toss {


    private static String tossWinner,tossLooser;
    private static Player[] tossWinnerTeam,tossLooserTeam;

     Scanner sc = new Scanner(System.in);

     public void coinToss(){
         int n, tossValue;

         System.out.println("\n\nYou are Team 1 or 2");
         System.out.println("1 : "+InputValues.getTeam1Name());
         System.out.println("2 : "+InputValues.getTeam2Name());
         n = sc.nextInt();



         System.out.println("\nToss Begins: Choose 0 - Head & 1- Tail");
         tossValue = sc.nextInt();


         if(tossValue == Toss.randomToss())
         {
             if(n==1)
             {
                 System.out.println("Team "+ InputValues.getTeam1Name() +" Won the Toss");
                 tossWinnerTeam=InputValues.team1;tossWinner=InputValues.getTeam1Name();
                 tossLooserTeam=InputValues.team2;tossLooser=InputValues.getTeam2Name();
             }else{
                 System.out.println("Team "+ InputValues.getTeam2Name() +" Won the Toss");
                 tossWinnerTeam=InputValues.team2;tossWinner=InputValues.getTeam2Name();
                 tossLooserTeam=InputValues.team1;tossLooser=InputValues.getTeam1Name();
             }

         }else{
             if(n==1)
             {
                 System.out.println("Team "+ InputValues.getTeam1Name() +" Lost the Toss");
                 tossWinnerTeam=InputValues.team2;tossWinner=InputValues.getTeam2Name();
                 tossLooserTeam=InputValues.team1;tossLooser=InputValues.getTeam1Name();
             }else{
                 System.out.println("Team "+ InputValues.getTeam2Name() +" Lost the Toss");
                 tossWinnerTeam=InputValues.team1;tossWinner=InputValues.getTeam1Name();
                 tossLooserTeam=InputValues.team2;tossLooser=InputValues.getTeam2Name();
             }
         }


     }

    public static Player[] getTossWinnerTeam() {
        return tossWinnerTeam;
    }

    public static Player[] getTossLooserTeam() {
        return tossLooserTeam;
    }

    public static String getTossWinner() {
        return tossWinner;
    }

    public static String getTossLooser() {
        return tossLooser;
    }

    public static int randomToss(){
        return (int)Math.round(Math.random());
    }
// This is a test line written in week1 branch
}
