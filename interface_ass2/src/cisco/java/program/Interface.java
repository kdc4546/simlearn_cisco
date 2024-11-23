package cisco.java.program;

import java.util.LinkedHashSet;
import java.util.Scanner;

	public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet L1 = new LinkedHashSet();

        L1.add(10);           
        L1.add(20);          
        L1.add(3.14f);        
        L1.add(1.618f);       
        L1.add('A');          
        L1.add('B');         
        L1.add(true);        

        System.out.println("LinkedHashSet L1: " + L1);

        LinkedHashSet L2 = new LinkedHashSet();

        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                // If the user input is not an integer, prompt them again
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
                System.out.print("Enter integer " + (i + 1) + ": ");
            }
            int number = scanner.nextInt();
            L2.add(number);  // Add the valid integer to L2
        }

        // Display elements of L2
        System.out.println("LinkedHashSet L2: " + L2);


	}
}


	import java.util.TreeSet;

	public class TreeSetExample {

	    public static void main(String[] args) {
	        // Create a TreeSet and add programming languages in random order
	        TreeSet<String> languages = new TreeSet<>();

	        // Adding programming languages in random order
	        languages.add("Python");
	        languages.add("Java");
	        languages.add("C++");
	        languages.add("JavaScript");
	        languages.add("Ruby");
	        languages.add("Go");

	        // Display the TreeSet (Note: TreeSet automatically sorts elements)
	        System.out.println("TreeSet after adding 6 languages: " + languages);

	        // Remove two languages
	        languages.remove("Java");
	        languages.remove("Ruby");

	        // Display TreeSet after removal
	        System.out.println("TreeSet after removing 'Java' and 'Ruby': " + languages);

	        // Add three more languages
	        languages.add("Swift");
	        languages.add("Kotlin");
	        languages.add("PHP");

	        // Display TreeSet after adding three new languages
	        System.out.println("TreeSet after adding 'Swift', 'Kotlin', and 'PHP': " + languages);

	        // Check if "Java" is part of the TreeSet
	        boolean containsJava = languages.contains("Java");
	        System.out.println("Does the TreeSet contain 'Java'? " + containsJava);

	        // Remove all elements from the TreeSet
	        languages.clear();

	        // Display TreeSet after clearing all elements
	        System.out.println("TreeSet after clearing all elements: " + languages);
	    }
	}





