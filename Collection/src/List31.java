import java.util.*;
public class List31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> p4=new Stack<String>();
		p4.push("Hye");
		p4.push("Hello");
		p4.push("Good");
		p4.push("Morning");
		System.out.println(p4);
		List<String> p5= new Stack<String>();
		p4.push("Good");
		p4.push("Afternoon");
		p4.push("All");
		System.out.println(p4);
		p4.addAll(1,p5);
		System.out.println(p4);
		System.out.println("First Stack"+p4);
		p4.set(1,"Hi");
		System.out.println("Updated Stack"+p4);
		p4.remove(1);
		System.out.println("After the Index Removal"+p4);
		p4.remove("All");
		System.out.println("After the object Removal"+p4);
		for (int i = 0; i < p4.size(); i++) 
		{  
		    
            System.out.print(p4.get(i) + " ");  
        }  
    
        System.out.println();   
        for (String str : p4)  
            System.out.print(str + " ");
        System.out.println("The size of the linked list is: " + p4.size());

	}

}
