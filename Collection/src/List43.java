import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
public class List43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 10;
		ArrayBlockingQueue<String> p7 = new ArrayBlockingQueue<String> (capacity);
		p7.add("Paris");
		p7.add("London");
		p7.add("Swiss");
		p7.add("Maldives");
		p7.add("Dubai");
		System.out.println(p7);
		boolean response = p7.remove("Swiss");
		System.out.println("Remove element:" + response);
		System.out.println("p7 contains:" +p7);
		System.out.println("Head of queue:" +p7.peek());
		Iterator S3 = p7.iterator();
		System.out.println("\n The iterator values:");
		while(S3.hasNext()) {
			System.out.println(S3.next());
		}
	}

}
