// Uyoojo Okene
//p.280

public class BowlingTeam {
    private String teamName;
    private final String[] members = new String[4];
    public void setTeamName(String team) {
        teamName = team;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setMember(int number, String name) {
        members[number] = name;
    }
    public String getMember(int number) {
        return members[number];
    }
    public void setMemberName(int x, String name) {
        throw new UnsupportedOperationException("Unimplemented method 'setMemberName'");
    }
}
