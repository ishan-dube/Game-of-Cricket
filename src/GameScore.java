import Player.Player;

import java.util.Random;

public class GameScore{

    static int[] gameScore = new int[3];

    public static void getMatchScore(int maxScore,Player[] team){

        int totalScore=0, totalWickets=0, ballsPlayed=0, currentRun=0;

        int currentPlayer=0,playedBalls=0,playerRuns=0,playerFours=0,playerSixes=0;


        for(int balls=1;balls<=6*InputValues.getTotalOvers();balls++){

            if(totalScore<=maxScore && totalWickets<InputValues.getTeamSize())
            {
                ballsPlayed++;
                playedBalls++;
                currentRun = GameScore.getRun();
                if (currentRun != 7)
                {
                    totalScore += currentRun;
                    playerRuns += currentRun;
                    System.out.print(" "+currentRun+" ");

                    if(currentRun==4){
                        playerFours++;
                    }
                    if(currentRun==6){
                        playerSixes++;
                    }
                } else {

                    System.out.print(" W ");
                    totalWickets++;
                    team[currentPlayer].setBalls(playedBalls);playedBalls=0;
                    team[currentPlayer].setRun(playerRuns);playerRuns=0;
                    team[currentPlayer].setFours(playerFours);playerFours=0;
                    team[currentPlayer].setSixes(playerSixes);playerSixes=0;
                    if(totalWickets!=InputValues.getTeamSize())
                    {
                        currentPlayer++;
                    }

                }
            } else {
                team[currentPlayer].setBalls(playedBalls);
                team[currentPlayer].setRun(playerRuns);
                team[currentPlayer].setFours(playerFours);
                team[currentPlayer].setSixes(playerSixes);
                break;
            }
            if(balls%6==0){System.out.println();}
        }

        gameScore[0]=totalScore;
        gameScore[1]=totalWickets;
        gameScore[2]=ballsPlayed;

    }

    public static int getRun()
    {
        Random random = new Random();
        Sleep.sleep(500);
        return random.nextInt(8);
    }

}

