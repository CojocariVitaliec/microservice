package service.controller.entities;

import java.util.HashMap;
import java.util.List;

public class OddsDto {
 private OddsTypeWdwDto wdw;
 private HashMap<String,Double> exact_score;

    public OddsTypeWdwDto getWdw() {
        return wdw;
    }

    public void setWdw(OddsTypeWdwDto wdw) {
        this.wdw = wdw;
    }

    public HashMap<String, Double> getExact_score() {
        return exact_score;
    }

    public void setExact_score(HashMap<String, Double> exact_score) {
        this.exact_score = exact_score;
    }
}
