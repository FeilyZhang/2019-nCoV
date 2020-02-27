package tech.feily.nCoV.model;

import java.util.List;

public class AreaModel {

    private List<AreaResultsModel> results;
    
    public void setResults(List<AreaResultsModel> results) {
        this.results = results;
    }
    
    public List<AreaResultsModel> getResults() {
        return results;
    }
    
    public String toString() {
        return results.toString();
    }
    
}
