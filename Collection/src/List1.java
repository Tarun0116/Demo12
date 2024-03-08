import java.util.*;
class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> p1= new ArrayList<String>();
		p1.add("Sai");
		p1.add("Subbu");
		p1.add("Ram");
		p1.add("Seshu");
		p1.add("Laxman");
		System.out.println(p1);
		ListIterator<String>iterator = p1.listIterator();
		System.out.println("\nUsing ListIterator:\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : "+ iterator.next());
        }
    }
		}
