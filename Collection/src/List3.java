import java.util.*;
public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> p3=new Vector<String>();
		p3.add("Amit");
		p3.add("Brahmi");
		p3.add("Chari");
		p3.add(2,"Dayal");
		System.out.println(p3);
		List<String> p4= new Vector<String>();
		p3.add("Sandeep");
		p3.add(1,"Pavan");
		p3.add("Nuthan");
		System.out.println(p3);
		p3.addAll(1,p4);
		System.out.println("First Vector"+p3);
		p3.set(1,"Abhii");
		System.out.println("Updated Vector"+p3);
		p3.remove(2);
		System.out.println("After the Index Removal"+p3);
		p3.remove("Dayal");
		System.out.println("After the object Removal"+p3);
		for (int i = 0; i < p3.size(); i++) 
		{  
		    
            System.out.print(p3.get(i) + " ");  
        }  
    
        System.out.println();   
        for (String str : p3)  
            System.out.print(str + " ");
        System.out.println("The size of the Vector is: " + p3.size());
		

	}

}
