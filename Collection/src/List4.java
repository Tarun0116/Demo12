import java.util.*;
public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> p4=new ArrayDeque<String>();
		p4.offer("SunDirect");
		p4.offer("TataSky");
		p4.offer("Vi");
		p4.offer("Airtel");
		p4.offer("Jio");
		p4.addFirst("Aircel");
		System.out.println(p4);
		System.out.println("First element:"+p4.peekFirst());
		System.out.println("Last element:"+p4.peekLast());
		System.out.println(p4.pollFirst());
		System.out.println(p4.pollLast());
		System.out.println("Hashcode value of the ArrayDeque:"+p4.hashCode());
		Iterator S1 = p4.iterator(); 
        System.out.println("The iterator values" + " of deque are:"); 
		while (S1.hasNext()) { 
            System.out.println(S1.next()); 
        } 
	}

}
 