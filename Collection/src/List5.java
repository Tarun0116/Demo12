import java.util.*;
public class List5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> p5= new HashSet<String>();
		p5.add("Delhi");
		p5.add("Mumbai");
		p5.add("Chennai");
		System.out.println(p5);
		p5.remove(1);
		System.out.println("After the Index Removal"+p5);
		p5.remove("Delhi");
		System.out.println("After the object Removal"+p5);
		Iterator value = p5.iterator();
		System.out.println("The Iterator values are:");
		while(value.hasNext()) {
			System.out.println(value.next());
		}
        for (String str : p5)  
            System.out.print(str + " ");
        System.out.println("The size of the HashSet is: " + p5.size());
        System.out.println("Hashcode value of the set:"+p5.hashCode());
        
        

	}

}
