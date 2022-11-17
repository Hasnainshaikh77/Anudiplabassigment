package labAssigment7;
import java.util.*;
import java.util.HashMap;
public class hasMap {//creating a class
	public static void main(String[] args) {
		HashMap<Integer,Integer> num =new HashMap<>();//create a HashMap 
		num.put(1, 1);//put elements in map
		num.put(2, 4);
		num.put(3, 9);
		num.put(4, 16);
		num.put(5, 25);
		num.put(6, 36);
		num.put(7, 49);
		num.put(8, 64);
		num.put(9, 81);
		num.put(10, 100);
		num.put(11, 121);
		num.put(12, 144);
		num.put(13, 169);
		num.put(14, 196);
		num.put(15, 225);
  //using loop		
		for (Map.Entry<Integer,Integer> entry :num.entrySet()) 
		{
			System.out.println("Square of key " + entry.getKey( )+ " Value "+entry.getValue( )); //printing output  
		}
	}

}
