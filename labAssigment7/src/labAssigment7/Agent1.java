package labAssigment7;

import java.util.ArrayList;
import java.util.Collections;

public class Agent1{  
    public static void main(String args[]){
            ArrayList<Agent> obj=new ArrayList<Agent>(); //creating ArrayList.
    //Adding object inArrayList.
            obj.add(new Agent(39,"hasnain",453));
            obj.add(new Agent(28,"mohit",448));
            obj.add(new Agent(35,"apurva",447));

    //sorting item of obj.
            Collections.sort(obj);
            for(Agent st:obj){ //using loop.
                System.out.println(st.Id +" "+st.name+" "+st.Area);//Printing the elements
            }
        }
    }
