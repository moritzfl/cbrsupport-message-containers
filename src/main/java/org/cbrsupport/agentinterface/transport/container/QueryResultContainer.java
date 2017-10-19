package org.cbrsupport.agentinterface.transport.container;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class QueryResultContainer {


    List<QueryResultEntryContainer> results = new ArrayList<>();


    public QueryResultContainer(){

    }

    public List<QueryResultEntryContainer> getResults() {
        return results;
    }

    public void addResultEntry(QueryResultEntryContainer entry){
        results.add(entry);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("results = " + results)
                .toString();
    }
}
