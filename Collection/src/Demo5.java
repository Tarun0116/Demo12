import java.util.*;
import java.util.concurrent.*;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> p8 = new TreeMap<Integer,String>();
    p8.put(1,"Abhii");
    p8.put(2,"Bob");
    p8.put(3,"Charlie");
    p8.put(4,"David");
    p8.put(5,"Ferguson");
    p8.put(6,"Marvel");
    System.out.println("TreeMap: " + p8);
    p8.remove(3,"Charlie");
    System.out.println("After removing element:" +p8);
    System.out.println("The First Key:" +p8.firstKey());
    System.out.println("The last key:" +p8.lastKey());
    System.out.println("Size of TreeMap:" +p8.size());
    System.out.println("Clone of TreeMap:" +p8.clone());
    System.out.println("HashCode of TreeMap:" +p8.hashCode());
    

    
	}

}
