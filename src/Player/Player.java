package Player;

public class Player {
    private String name;
    private int role,balls,fours,sixes,run;
    private String team;

    public Player(int role){
        this.role=role;
    }

    public Player(String name,String team)
    {
        this.name=name;
        this.team=team;
    }

    public Player(String name,int role,String team)
    {
        this.name=name;
        this.team=team;
        this.role=role;
    }
    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public int getBalls() {
        return balls;
    }

    public int getFours() {
        return fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}
