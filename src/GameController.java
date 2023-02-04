import Player.Player;

import java.util.Scanner;

public class GameController {

    InputValues inputValues = new InputValues();
    Toss toss = new Toss();
    Scanner sc = new Scanner(System.in);

    int team1Score,team2Score;

    public void startMatch()
    {
        inputValues.getMatchDetails();
        toss.coinToss();
    }

    public void playMatch()
    {
        System.out.println("\n"+Toss.getTossWinner() + " Would you like to 0-BAT or 1-BALL:");
        int n= sc.nextInt();

        if(n==0)
        {
            System.out.println("\n"+Toss.getTossWinner()+" Batting...");
            GameScore.getMatchScore(60*InputValues.getTotalOvers(),Toss.getTossWinnerTeam());
            displayScoreBoard(Toss.getTossWinnerTeam());displayScore(Toss.getTossWinner());
            team1Score=GameScore.gameScore[0];
            System.out.println("\n"+Toss.getTossLooser()+" Batting...");
            GameScore.getMatchScore(GameScore.gameScore[0],Toss.getTossLooserTeam());
            displayScoreBoard(Toss.getTossLooserTeam());displayScore(Toss.getTossLooser());
            team2Score=GameScore.gameScore[0];
            declareWinner(team1Score,team2Score,Toss.getTossWinner(),Toss.getTossLooser());

        }else if(n==1) {
            System.out.println("\n"+Toss.getTossLooser()+" Batting...");
            GameScore.getMatchScore(10*InputValues.getTotalOvers(),Toss.getTossLooserTeam());
            displayScoreBoard(Toss.getTossLooserTeam());displayScore(Toss.getTossLooser());
            team1Score=GameScore.gameScore[0];
            System.out.println("\n"+Toss.getTossWinner()+" Batting...");
            GameScore.getMatchScore(GameScore.gameScore[0],Toss.getTossWinnerTeam());
            displayScoreBoard(Toss.getTossWinnerTeam());displayScore(Toss.getTossWinner());
            team2Score=GameScore.gameScore[0];
            declareWinner(team1Score,team2Score,Toss.getTossLooser(),Toss.getTossWinner());

        }
        else{
            endMatch();
        }

    }

    public void displayScore(String teamName)
    {
        Sleep.sleep(400);
        System.out.println();
        System.out.println(teamName+ " ScoreBoard");
        Sleep.sleep(400);
        System.out.println("Runs: "+ GameScore.gameScore[0]);
        System.out.println("Wickets: "+ GameScore.gameScore[1]);
        System.out.println("Balls: "+ GameScore.gameScore[2]);
        System.out.println();
        System.out.println("*******************");
    }

    public void displayScoreBoard(Player[] team)
    {
        Sleep.sleep(200);
        System.out.println("\n\n Printing Detailed Score Board\n");
        Sleep.sleep(100);
        System.out.println("-------------------------------------------------------------------------");
        System.out.format("%15s %15s %15s %15s\n", "Name", "Run", "Fours","Sixes");
        System.out.println("-------------------------------------------------------------------------");
        for(int i=0;i<InputValues.getTeamSize();i++)
        {
            System.out.format("%14s %14s %14s %18s\n", team[i].getName(),team[i].getRun(),team[i].getFours(),team[i].getSixes());
            Sleep.sleep(250);
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public void declareWinner(int team1Score,int team2Score,String team1,String team2)
    {
        Sleep.sleep(200);
        if(team1Score > team2Score)
        {
            System.out.println("\n Team "+ team1 + " Wins");
        }

        else if(team1Score == team2Score)
        {
            System.out.println("\n Match Draw");
        }

        else
        {
            System.out.println("\n Team "+ team2 + " Wins");
        }

        System.out.println("*******************");
    }
    public void endMatch()
    {
        Sleep.sleep(1000);
        System.out.println("\n\nGame Ended");
    }


}
