package in.ac.bitsgoa.agentmodel.agent;

import java.util.ArrayList;

import in.ac.bitsgoa.agentmodel.context.Context;
import in.ac.bitsgoa.agentmodel.context.InClass;
import in.ac.bitsgoa.agentmodel.identity.Identity;
import in.ac.bitsgoa.agentmodel.identity.Student;
import in.ac.bitsgoa.agentmodel.practice.AbstractConcreteSocialPractice;
import in.ac.bitsgoa.agentmodel.practice.AbstractSocialPractice;
import in.ac.bitsgoa.agentmodel.practice.ListenInClass;

public class Agent {
    ArrayList<Agent> neighbours;
    ArrayList<Identity> id;
    Identity salientId;
    public Agent() {
        neighbours = null;
    }
    public Identity setSalientIdentity(Context c) {
        Identity id = null;
        if(c instanceof InClass) {
            id = new Student("test");
        }
        salientId = id;
        return id;
    }
    public void interact(Agent agent) {
        if(salientId instanceof Student) {
            
        }
    }
    public AbstractConcreteSocialPractice createCSP(AbstractSocialPractice ASP) {
        ListenInClass a = null;
        return a;
    }
    public void addNeighbours(ArrayList<Agent> list) {
        this.neighbours.addAll(list);
    }
    public void removeNeighbour(Agent agent) {
        this.neighbours.remove(agent);
    }
}
