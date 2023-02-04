import Player.Player;

import java.util.*;
import java.util.concurrent.TimeoutException;

public class InputValues {

    Scanner sc = new Scanner(System.in);

    static Player[] team1;
    static Player[] team2;

    private static int totalOvers, teamSize;
    private static String team1Name, team2Name;

    public static int getTeamSize() {
        return teamSize;
    }

    public static int getTotalOvers() {
        return totalOvers;
    }

    public static String getTeam2Name() {
        return team2Name;
    }

    public static String getTeam1Name() {
        return team1Name;
    }

    public void getMatchDetails() {
        System.out.println("Enter the number of Overs: ");
        totalOvers = sc.nextInt();

        System.out.println("Enter Team Size: ");
        teamSize = sc.nextInt();


        System.out.println("\nEnter Team 1 Name: ");
        team1Name = sc.next();

        System.out.println("Enter Team 2 Name: ");
        team2Name = sc.next();

        team1 = new Player[teamSize];
        team2 = new Player[teamSize];
        System.out.println("\n\nTeam " + team1Name + " Details: ");
        for (int i = 1; i <= teamSize; i++) {
            System.out.println("Player " + i);
            team1[i - 1] = new Player(sc.next(), team1Name);
            System.out.println("Press 0-Batsman & 1-Baller");
            team1[i-1].setRole(sc.nextInt());
        }


        System.out.println("\n\nTeam " + team2Name + " Details: ");
        for (int i = 1; i <= teamSize; i++) {
            System.out.println("Player" + i);
            team2[i - 1] = new Player(sc.next(), team2Name);
            System.out.println("Press 0-Batsman & 1-Baller");
            team2[i - 1].setRole(sc.nextInt());
        }

    }
}
