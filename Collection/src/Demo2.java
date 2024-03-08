import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> p1= new HashSet<String>();
		p1.add("Alice");
		p1.add("Bob");
		p1.add("Charlie");
		System.out.println(p1);
		System.out.println("size of Hashaset="+p1.size());
		p1.remove(3);
		System.out.println("After the Index Removal"+p1);
		p1.remove("Charlie");
		System.out.println("After the object Removal"+p1);

	}

}
