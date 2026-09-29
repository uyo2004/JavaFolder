// Uyoojo Okene
// p.157

import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter information for Team 1");
            
            System.out.print("High school: ");
            String school1 = input.nextLine();
            
            System.out.print("Sport: ");
            String sport1 = input.nextLine();
            
            System.out.print("Team name: ");
            String name1 = input.nextLine();
            
            Team team1 = new Team(school1, sport1, name1);
            
            System.out.println("\nEnter information for Team 2");
            
            System.out.print("High school: ");
            String school2 = input.nextLine();
            
            System.out.print("Sport: ");
            String sport2 = input.nextLine();
            
            System.out.print("Team name: ");
            String name2 = input.nextLine();
            
            Team team2 = new Team(school2, sport2, name2);
            
            System.out.print("\nEnter game time: ");
            String time = input.nextLine();
            
            Game game = new Game(team1, team2, time);
            
            displayGame(game);
        }
    }

    public static void displayGame(Game game) {
        System.out.println("\nGame Details");

        System.out.println("Team 1: " +
                game.getTeam1().getHighSchoolName() + " " +
                game.getTeam1().getTeamName());

        System.out.println("Sport: " +
                game.getTeam1().getSport());

        System.out.println("Team 2: " +
                game.getTeam2().getHighSchoolName() + " " +
                game.getTeam2().getTeamName());

        System.out.println("Sport: " +
                game.getTeam2().getSport());

        System.out.println("Game time: " + game.getGameTime());
    }
}
