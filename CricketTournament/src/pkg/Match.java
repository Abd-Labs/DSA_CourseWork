
package pkg;

public class Match {
 private int matchId;
 private team  team1;
 private team  team2;
 private int overs;
 Result result;
 Toss toss;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public team getTeam1() {
        return team1;
    }

    public void setTeam1(team team1) {
        this.team1 = team1;
    }

    public team getTeam2() {
        return team2;
    }

    public void setTeam2(team team2) {
        this.team2 = team2;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

 
}
