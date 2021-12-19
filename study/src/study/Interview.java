package study;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Interview {

	// Java Program to find common elements
	// in two ArrayLists
	// Using Stream filter method

	// import ArrayList package


		// main method
		public static void main(String[] args)
		{
			
			ArrayList<String> al = new ArrayList<String>();
			al.add("Apple");al.add("Banana");al.add("orange");al.add("orange");
			
			
			

			// create ArrayList list1
			ArrayList<String>
				list1 = new ArrayList<String>();

			// Add values in ArrayList
			list1.add("Hii");
			list1.add("Geeks");
			list1.add("for");
			list1.add("Geeks");

			// print list 1
			System.out.println("List1: "
							+ list1);

			// Create ArrayList list2
			ArrayList<String>
				list2 = new ArrayList<String>();

			// Add values in ArrayList
			list2.add("Hii");
			list2.add("Geeks");
			list2.add("Gaurav");

			// print list 2
			System.out.println("List2: "
							+ list2);

			// Find common elements
			System.out.print("Common elements: ");
			System.out.println(list2.stream().collect(Collectors.groupingBy(c->c , Collectors.counting()))) ;
		
		
			Stream<String> s3 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
	        long r3 = s3.filter(e->e.length()==5).count();
	        System.out.println(r3);
	        //Reduced Example
	        Stream<String> s4 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
	        Optional<String> reduced = s4.reduce((s1,s2) -> s1 + "#" + s2);
	        reduced.ifPresent(System.out::println);
		
		}
}
		
	
	

