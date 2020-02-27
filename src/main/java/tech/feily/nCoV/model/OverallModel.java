package tech.feily.nCoV.model;

import java.util.List;

public class OverallModel {

    private List<OverallResultsModel> results;
    
    public void setResults(List<OverallResultsModel> results) {
        this.results = results;
    }
    
    public List<OverallResultsModel> getResults() {
        return results;
    }
    
    public String toString() {
        return results.toString();
    }
    
}
