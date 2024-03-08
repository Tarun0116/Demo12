import java.util.*;
public class List42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p6 = new PriorityQueue<Integer> ();
		p6.add(5);
		p6.add(3);
		p6.add(8);
		p6.add(1);
		p6.add(2);
		System.out.println(p6);
		System.out.println("Queue head:" +p6.poll());
		System.out.println("Queue head:" +p6.poll());
		System.out.println("Queue head:" +p6.poll());
		System.out.println("Queue head:" +p6.poll());
		System.out.println("Queue head:" +p6.poll());
		
	}

}
