package org.cbrsupport.agentinterface.transport.container;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.StringJoiner;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FeedbackContainer {
    private int caseId;
    private boolean useful;
    private String query;


    public FeedbackContainer() {

    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public boolean isUseful() {
        return useful;
    }

    public void setUseful(boolean useful) {
        this.useful = useful;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("caseId = " + caseId)
                .add("query = " + query)
                .add("useful = " + useful)
                .toString();
    }
}
