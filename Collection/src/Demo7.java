import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> p1 = new LinkedHashMap<Integer,String>();
		p1.put(1,"Google");
		p1.put(2,"Microsoft");
		p1.put(3,"Wipro");
		p1.put(4,"Infosys");
		p1.put(5,"Ibm");
		p1.put(6,"Cognizant");
		System.out.println(p1);
		p1.put(6,"ADP");
		System.out.println("After Adding Element:" +p1);
		p1.remove(5);
		System.out.println("After Removing Element:" +p1);
		for (Map.Entry<Integer, String> S1 : p1.entrySet()) 
		{
			Integer key = S1.getKey();
			String value = S1.getValue();
			System.out.println(key + " : " + value);
			}
		
	}

}
