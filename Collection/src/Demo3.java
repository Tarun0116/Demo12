import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> p1 = new HashMap<>();
		p1.put("Apple","Red");
		p1.put("Banana","Yellow");
		p1.put("Cherry","Red");
		p1.put("Mango","Yellow");
		p1.put("Pineapple","Green");
		System.out.println("Mapping of HashMap p1 are:" +p1);
		p1.remove("Mango");
		System.out.println("After removing element:" +p1);
		for (Map.Entry<String, String> e : p1.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		System.out.println("Set is:" +p1.entrySet());
		p1.computeIfPresent("Cherry",(key, val) -> val + 1);
		System.out.println("after operation :\n "+ p1);
		System.out.println("Size of HashMap:" +p1.size());
		System.out.println("Clone of HashMap:" +p1.clone());
		System.out.println("HashCode of HashMap:" +p1.hashCode());




	}

}
