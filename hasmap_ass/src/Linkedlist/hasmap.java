package Linkedlist;


import java.util.HashMap;
import java.util.Map;

public class hasmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> countryMap = new HashMap<>();
	        countryMap.put(1, "USA");
	        countryMap.put(44, "UK");
	        countryMap.put(91, "India");
	        countryMap.put(81, "Japan");
	        countryMap.put(33, "France");
	        countryMap.put(49, "Germany");
	        countryMap.put(7, "Russia");
	        countryMap.put(61, "Australia");
	        countryMap.put(39, "Italy");
	        countryMap.put(34, "Spain");
	        
	        System.out.println("keys: " + countryMap.keySet());
	       
	        System.out.println("values: " + countryMap.values());
 
	        if (countryMap.containsValue("India")) {
	            System.out.println("India exists in the map.");
	        } else {
	            System.out.println("India not exist in the map.");
	        }

	      
	        if (countryMap.containsKey(45)) {
	            System.out.println("45 exists in the map.");
	        } else {
	            System.out.println("45 does not exist in the map.");
	        }

	       
	        countryMap.remove(39);
	        System.out.println("After removing country with key 39 (Italy): " + countryMap);
	        
	        Map<Integer, String> stateMap = new HashMap<>();
	        stateMap.put(1, "California");
	        stateMap.put(2, "Texas");
	        stateMap.put(3, "Florida");
	        stateMap.put(4, "New York");
	        stateMap.put(5, "Illinois");
	  
	        countryMap.putAll(stateMap);
	        System.out.println("After merging state map into country map: " + countryMap);

	       
	        countryMap.remove(5);
	        System.out.println("After removing the key 5 (Illinois): " + countryMap);

	        if (countryMap.isEmpty()) {
	            System.out.println("The map is empty.");
	        } else {
	            System.out.println("The map is not empty.");
	        }

	        countryMap.clear();
	        System.out.println("After clearing the map: " + countryMap);
	    


	}
}