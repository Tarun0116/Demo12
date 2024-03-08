import java.util.*;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> p9 = new PriorityQueue<String> ();
		p9.add("Tarun");
		p9.add("Varun");
		p9.add("Sai");
		p9.add("Ram");
		p9.add("Raju");
		System.out.println(p9);
		p9.remove();
		System.out.println("After Removing:" +p9);
		p9.peek();
		System.out.println("After Peaking element:" +p9);
		p9.poll();
		System.out.println("After poll:" +p9);
		System.out.println("size of PriorityQueue="+p9.size());
		p9.element();
		System.out.println("Whether the elements are present:" +p9);
	}

}
