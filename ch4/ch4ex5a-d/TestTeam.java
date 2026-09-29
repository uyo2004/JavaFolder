// Uyoojo Okene
// p.157

import java.util.Scanner;

public class TestTeam {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        System.out.println("\nTeam 1:");
        display(team1);

        System.out.println("\nTeam 2:");
        display(team2);

        System.out.println("\nTeam 3:");
        display(team3);

        input.close();
    }

    public static Team setTeamData() {
        System.out.print("Enter high school name: ");
        String school = input.nextLine();

        System.out.print("Enter sport: ");
        String sport = input.nextLine();

        System.out.print("Enter team name: ");
        String name = input.nextLine();

        return new Team(school, sport, name);
    }

    public static void display(Team team) {
        System.out.println("High school: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}