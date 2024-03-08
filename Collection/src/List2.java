import java.util.*;
public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> p2=new LinkedList<String>();
		p2.add("Telangana");
		p2.add("Hyderabad");
		p2.add(1,"Urdu");
		p2.add("Ugadi");
		System.out.println(p2);
		List<String> p3= new LinkedList<String>();
		p2.add("Laxman");
		p2.add("Rajesh");
		p2.add("Krishna");
		System.out.println(p2);
		p2.addAll(1,p3);
		System.out.println("First LinkedList"+p2);
		p2.set(1,"Telugu");
		System.out.println("Updated LinkedList"+p2);
		p2.remove(1);
		System.out.println("After the Index Removal"+p2);
		p2.remove("Ugadi");
		System.out.println("After the object Removal"+p2);
		for (int i = 0; i < p2.size(); i++) 
		{  
		    
            System.out.print(p2.get(i) + " ");  
        }  
    
        System.out.println();   
        for (String str : p2)  
            System.out.print(str + " ");
        System.out.println("The size of the linked list is: " + p2.size());
        
        
		
		
		
		

	}

}
