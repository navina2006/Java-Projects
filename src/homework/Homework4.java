package homework;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
/*
public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> o = new LinkedList<>();
		o.add("Apple");
		o.add("Soap");
		o.add("Apple");
		o.add("Milk");
		o.add("Soap");
		System.out.println("Original Cart : " +o);
		
		LinkedList<String> o1 = new LinkedList<>();
		 for(String b : o) {
			 if(!o1.contains(b)) {	
				 o1.add(b);
			 }
		 }
		System.out.print("Cleaned Cart : " +o1);
	}

}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		Set<Integer> id = new LinkedHashSet<>();
		id.add(102);
		id.add(103);
		id.add(205);
		int searchId = 102;
		if(id.contains(searchId)) {
			System.out.println("StudentId " +searchId +" is Present");
		}
		else {
			System.out.println("StudentId " +searchId +" is Absent");
		}
	}
}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<>();
		map.put("Laptop",55000.0);
		map.put("Phone",65000.0);
		map.put("Ipad", 45000.0);
		String product = "Laptop";
		if(map.containsKey(product)) {
		System.out.println("Product: " +product);
		System.out.println("Price: " +map.get(product));
		}
	}
}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<>();
		obj.add(95);
		obj.add(48);
		obj.add(80);
		obj.add(45);
		int highestMark = obj.get(0);
		int lowestMark = obj.get(0);
		for(int a : obj) {
			if(a >= highestMark) {
				highestMark =a;
			}
			if(a <= lowestMark) {
				lowestMark = a;	
			}
		}
		System.out.println("HighestMark: " +highestMark);
		System.out.println("LowestMark: " +lowestMark);
	}
}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<>();
		obj.add("Suresh");
		obj.add("Anitha");
		obj.add("Kumar");
		obj.add("Rahul");
		Collections.sort(obj);
		for(String names : obj) {
			System.out.println("Sorted Students : " +names);
		}
	}
}		
*/
 // ---- MEDIUM LEVEL-----
/*
public class Homework4 {
	public static void main(String[] args) {
		 Map<String,Integer> map = new HashMap<>();
		 map.put("Anu",50);
		 map.put("Navina",60);
		 map.put("Arjun", 75);
		 map.put("Meena",90);
		 int average = 72;
		 System.out.println("Average Marks: " +average);
		 System.out.println("Students Above Average: ");
		 for (Map.Entry<String, Integer> entry : map.entrySet()) {
			 if(entry.getValue()>= 72) {
				 System.out.println(entry.getKey()); 
			 } 
		 } 
		 } }
	*/
/*
public class Homework4 {
	public static void main(String[] args) {
		List<String> o = new LinkedList<>();
		o.add("navi1234@gmail.com");
		o.add("yuvin1234@gmail.com");
		o.add("abc@gmail.com");		
		String id = "abc@gmail.com";
		if(o.contains(id)) {
			System.out.println("Duplicates Emails Found : " +id);
		}
	}
}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		Map<String,Integer> obj = new HashMap<>();
		obj.put("Java",120);
		obj.put("c++", 15);
		obj.put("python", 10);
		String mostPopularCourse = "";
		int maxValue = 0;
		for (Map.Entry<String,Integer> e : obj.entrySet()) {
		    if (e.getValue() > maxValue) {
		        maxValue = e.getValue();
		        mostPopularCourse = e.getKey();
System.out.println("Most Popular course : "+e.getKey() +"(" +e.getValue() +"Enrollements" +")");
		    }
		}
		}
	}
*/
/*
public class Homework4 {
	public static void main(String[] args) {
		Map<String, Integer> obj = new HashMap<>();
		   obj.put("Rice", 8);
           obj.put("Soap", 5);
           obj.put("Vegetables", 11);
           int maxValue = 10;
           for (Map.Entry<String, Integer> e : obj.entrySet()) {
        	   if (e.getValue() < maxValue) {
        		   System.out.println(e.getKey() +" : " +e.getValue());
	}}}}
*/

//class Demo1{
//	String name;
//	int Salary;
//	Demo1(String name,int Salary){
//		this.name = name;
//		this.Salary = Salary;
//	}
//}
//public class Homework4 {
//	public static void main(String[] args) {
//		List<Demo1> o = new LinkedList<>();
//		//o.add(new Demo1("Anu" ,25000));
//		o.add(new Demo1("Priya",45000));
//		o.add(new Demo1("Ravi",35000));
//		o.add(new Demo1("Anu" ,25000));
//		for(Demo1 s: o){
//		System.out.println(s.name +": " + s.Salary);
//	
//		}
//	}
//}
//------- HARD LEVEL----------
/*
public class Homework4 {
 static ConcurrentHashMap <String,String> o = new ConcurrentHashMap<>();
 
 public static void bookSeat(String Seat ,String user) {
	 
	 String result = o.putIfAbsent(Seat, user);
	 if(result ==  null) {
			 System.out.println(user +" booked seat " +Seat +" successfully");
		 }
		 else {
			 System.out.println(user +" failed:Seat already booked");
		 }
	 }
 
 public static void main(String[] args) {
	 Thread user1 = new Thread(()->bookSeat("A1","User1" ));
	 Thread user2 = new Thread(()->bookSeat("A1","User2"));
	  user1.start();
	  user2.start();
 }
} 
*/
/*
public class Homework4 {
   public static void main(String[] args) {	
	   Set<Integer> o = new LinkedHashSet<>();	
	   Map<Integer,String> obj = new HashMap<>();
	   int a = 101;
	   obj.put(101,"Canditate A");
	   o.add(a);
	   for(Integer b: o) {
		  if(!o.add(a)) {
			   System.out.println("Duplicate Vote Detected for " + a);
			   System.out.println("Winner : " +obj.get(a));
		  }
		  } 
	   }
   }
 */
/*
public class Homework4 {
	   public static void main(String[] args) {	
	Queue<String> o = new LinkedList<>();
	System.out.println("Message Processed:");
	o.add("Hello");
	o.add("How are you?");
	o.add("Goodbye");
	System.out.println(o.poll());
	System.out.println(o.poll());
	System.out.println(o.poll());
	   }
	   }	
*/	
/*
public class Homework4 {
	   public static void main(String[] args) {
		   List<String> o = new LinkedList<>();
		   o.add("TXN101"); 
		   o.add("TXN102");
		   o.add("TXN102"); 
		   o.add("TXN103");	 
		   o.add("TXN102");
		   Map<String,Integer> map = new HashMap<>();
		   for(String str : o) {
	            map.put(str, map.getOrDefault(str, 0) + 1);
	        }
		   System.out.println("Suspicious Transactions Detected:");
		   for (Map.Entry<String, Integer> e : map.entrySet()){
	            if (e.getValue() > 1) {
	                System.out.println(e.getKey() + " repeated " + e.getValue() + " times");
	            }
	        }
	   }
}
*/	
/*
public class Homework4 {
	   public static void main(String[] args) {
		   Map<String,Integer> o = new LinkedHashMap<>();
		   o.put("Key1", 10);
		   o.put("Key2", 20);
		   o.put("Key3", 30);
		   o.put("Key4", 40);
	        o.remove(o.keySet().iterator().next());
	        System.out.println("Cache After Access: "); 
	        System.out.println(o.keySet());   
	   }
	   }
*/

