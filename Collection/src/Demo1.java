import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p1= new ArrayList<Integer>();
		p1.add(1);
		p1.add(2);
		p1.add(3);
		p1.add(4);
		p1.add(5);
		System.out.println("After Adding elements:" +p1);
		p1.removeIf(e->(e%2)==0);;
		System.out.println("After removing even elements:" +p1);	

	}

}
