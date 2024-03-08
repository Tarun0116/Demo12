import java.util.*;
public class List8 {
	enum City {Hyderabad,Mumbai,Chennai,Delhi}  
    public static void main(String[] args) 
    {  
        EnumSet<City> cities = EnumSet.allOf(City.class);  
        System.out.println("EnumSet:"+ cities);
        EnumSet<City> cities1 = EnumSet.allOf(City.class);
        EnumSet<City> cities2 = EnumSet.noneOf(City.class);
        cities1.add(City.Delhi);
        System.out.println("EnumSet add():"+cities1);
        cities1.addAll(cities2);
        System.out.println("EnumSet addAll:"+cities1);
        boolean value3 = cities.remove(City.Chennai);
        System.out.println("Is Chennai removed!"+value3);
        System.out.println("Hashcode value of the set:"+cities.hashCode());
        System.out.println("size of LinkedHashaset="+cities.size());
        EnumSet<City> p1 = cities.clone();
        System.out.println("Clone Set is:"+p1);
        Iterator<City> S1 = cities.iterator(); 
        System.out.print("EnumSet: "); 
        while (S1.hasNext()) 
        { 
             System.out.print(S1.next()); 
            System.out.print(", "); 
        }
        
    } 
}
