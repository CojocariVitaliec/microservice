package service.controller.entities;

public class MatcheDto {

    private  int id;
    private TeamDto home;
    private TeamDto away;
    private OddsDto odds;
    private String status;
    private String start_time;
    private String end_time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeamDto getHome() {
        return home;
    }

    public void setHome(TeamDto home) {
        this.home = home;
    }

    public TeamDto getAway() {
        return away;
    }

    public void setAway(TeamDto away) {
        this.away = away;
    }

    public OddsDto getOdds() {
        return odds;
    }

    public void setOdds(OddsDto odds) {
        this.odds = odds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}
