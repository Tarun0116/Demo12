import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> p1=new LinkedList<String>();
		p1.add("A");
		p1.add("B");
		p1.add("C");
		p1.add("D");
		p1.add("E");
		p1.add("F");
		System.out.println(p1);
		Object[] a = p1.toArray();
        System.out.print(
            "After converted LinkedList to Array: ");
        for (Object element : a)
            System.out.print(element + " ");

	}

}
