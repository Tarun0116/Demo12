import java.util.concurrent.*;
import java.util.*;
public class List41 {

	public static void main(String[] args) 
			throws InterruptedException
	{
		int capacity = 6;
		BlockingQueue<String> p5=new ArrayBlockingQueue<String>(capacity);
		p5.put("Sun");
		p5.put("Moon");
		p5.put("Saturn");
		p5.put("Venus");
		p5.put("Mars");
		System.out.println(p5);
		p5.remove();
		p5.put("Earth");
		System.out.println(p5);
		if (p5.contains("Venus")) {
			System.out.println("Venus is contains");
		}
		else
			System.out.println("Not Contains");
		Iterator<String> S1 = p5.iterator();
		System.out.println("BlockingQueue:");
		for(int i = 0;i<p5.size();i++) {
			System.out.println(S1.next() + " ");
		}
		
	}

}
