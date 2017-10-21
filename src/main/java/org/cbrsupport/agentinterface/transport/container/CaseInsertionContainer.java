package org.cbrsupport.agentinterface.transport.container;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.StringJoiner;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CaseInsertionContainer {
    String query;
    String solution;
    List<String> keywords;

    public CaseInsertionContainer() {

    }

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


    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("keywords = " + keywords)
                .add("query = " + query)
                .add("solution = " + solution)
                .toString();
    }
}
