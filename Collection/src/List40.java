import java.util.Iterator;
import java.util.concurrent.*;
public class List40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingDeque<String> p1 = new LinkedBlockingDeque<String>();
		p1.push("Dell");
		p1.push("Hp");
		p1.push("Lenovo");
		p1.push("Mac");
		p1.push("Asus");
		p1.push("Acer");
		System.out.println(p1);
		p1.addFirst("MSI");
		System.out.println("Element added at First:" +p1);
		p1.addLast("Samsung");
		System.out.println("Element added at Last:" +p1);
		Iterator S1 = p1.iterator();
		System.out.println("Iterator values + p1:");
		while (S1.hasNext()) {
			System.out.println(S1.next());
		}
		System.out.println("After Peeking :" +p1.peek());
		System.out.println("After first element peeks:" +p1.peekFirst());
		System.out.println("After last element peeks:" +p1.peekLast());
		System.out.println("After poll :" +p1.poll());
		System.out.println("After first element poll:" +p1.pollFirst());
		System.out.println("After last element poll:" +p1.pollLast());
	}

}
