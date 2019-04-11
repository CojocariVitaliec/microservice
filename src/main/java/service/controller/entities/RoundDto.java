package service.controller.entities;

import java.util.HashMap;
import java.util.List;

public class RoundDto {

    private int id;
    private String name;
    private String status;
    private String game_types;
    private HashMap<Integer, Integer> variations;
    private List<MatcheDto> matches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGame_types() {
        return game_types;
    }

    public void setGame_types(String game_types) {
        this.game_types = game_types;
    }

    public HashMap<Integer, Integer> getVariations() {
        return variations;
    }

    public void setVariations(HashMap<Integer, Integer> variations) {
        this.variations = variations;
    }

    public List<MatcheDto> getMatches() {
        return matches;
    }

    public void setMatches(List<MatcheDto> matches) {
        this.matches = matches;
    }
}


