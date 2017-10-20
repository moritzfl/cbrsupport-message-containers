package org.cbrsupport.agentinterface.transport.container;

import java.util.List;

public class CaseInsertionContainer {
    String query;
    String solution;
    List<String> keywords;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public CaseInsertionContainer() {

    }
}
