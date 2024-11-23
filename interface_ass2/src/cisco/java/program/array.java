package cisco.java.program;

import java.util.ArrayList;
import java.util.Collections;

public class array {
	    public static void main(String[] args) {
	       
	        ArrayList list = new ArrayList();
	        
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Mango");
	        list.add("Grapes");
	        list.add("Pineapple");
	        list.add("Orange");

	        list.add("India");
	        list.add("Pakistan");

	        list.add("playing");
	        list.add("watching anmies");

	        System.out.println("ArrayList: " + list);

	        list.remove("watching anmies");

	        if (list.contains("cricket")) {
	            System.out.println("cricket in the list.");
	        } else {
	            System.out.println("cricket not in the list.");
	        }

	        list.remove("India");  
	        list.remove("Mango");  

	       
	        list.add("Dancing");
	        Collections.reverse(list);
	        System.out.println("Reversed ArrayList: " + list);

	       
	        list.add(3, "Andhra");  
	        list.add(1, "Mango");   
	        
	        System.out.println("Final ArrayList: " + list);
	    }
	}



