import java.util.*;
public class List7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> p7=new TreeSet<String>();
		p7.add("Varshith");
		p7.add("Prasanth");
		p7.add("Govind");
		p7.add("Arvind");
		System.out.println(p7);
		System.out.println("size of Treeset="+p7.size());
		p7.remove("Govind");
		System.out.println("after removing"+p7);
		Iterator value = p7.iterator();
		System.out.println("The Iterator values are:");
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		System.out.println("Hashcode value of the set:"+p7.hashCode());
		Object[] arr=p7.toArray();
		System.out.println("The array:");
		for (int j = 0;j < arr.length; j++)
			System.out.println(arr[j]);
		TreeSet Clone=new TreeSet();
		Clone=(TreeSet)p7.clone();
		System.out.println("Cloned TreeSet:"+Clone);
		
		
		
	}

}
