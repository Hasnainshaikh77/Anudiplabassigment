package labAssigment7;

import java.util.ArrayList;
import java.util.Collections;


class Agent implements Comparable<Agent> { //Define Agent class
    int Id;
    String name;
    int Area;

    Agent(int Id, String name, int Area) {
        this.Id = Id;
        this.name = name;
        this.Area = Area;
    }

    public int compareTo(Agent st) {
    // comparing by Area.
        if (Area == st.Area)
            return 0;
        else if (Area > st.Area)
            return 1;
        else
            return -1;
    }
}


