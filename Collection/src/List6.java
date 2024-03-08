import java.util.*;
public class List6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> p6=new LinkedHashSet<String>();
		p6.add("Vinay");
		p6.add("Prasad");
		p6.add("Gangadhar");
		p6.add("Ashok");
		System.out.println(p6);
		System.out.println("size of LinkedHashaset="+p6.size());
		p6.remove("Ashok");
		System.out.println("after removing"+p6);
		LinkedHashSet Clone=new LinkedHashSet();
		Clone=(LinkedHashSet)p6.clone();
		System.out.println("Cloned LinkedHashSet:"+Clone);
		Iterator value = p6.iterator();
		System.out.println("The Iterator values are:");
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		System.out.println("Hashcode value of the set:"+p6.hashCode());
		Object[] arr=p6.toArray();
		System.out.println("The array:");
		for (int j = 0;j < arr.length; j++)
			System.out.println(arr[j]);
		
		
		

	}

}
