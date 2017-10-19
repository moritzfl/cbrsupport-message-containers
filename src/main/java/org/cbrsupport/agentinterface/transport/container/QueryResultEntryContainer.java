package org.cbrsupport.agentinterface.transport.container;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.StringJoiner;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryResultEntryContainer {
    double similarity;
    String solution;
    int caseId;
    int solutionId;


    public QueryResultEntryContainer() {
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }



    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("caseId = " + caseId)
                .add("similarity = " + similarity)
                .add("solution = " + solution)
                .toString();
    }

    public void setSolutionId(int solutionId) {
        this.solutionId = solutionId;
    }
}
