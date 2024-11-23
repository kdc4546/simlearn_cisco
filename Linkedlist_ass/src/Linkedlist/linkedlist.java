package Linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> months = new LinkedList<>();

        
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("April");
        months.add("November");     
        months.addLast("December");
        months.addFirst("January");      
        months.add(2, "March");   
        months.add(3, "February"); 

        months.add(5, "September");  
        months.add(6, "October");   

        System.out.println("months:" + months);
        
        System.out.println("\neven and odd Months:");
        for (int i = 0; i < months.size(); i++) {
            if (i % 2 == 0) {                
                System.out.println(months.get(i));  
            } else {              
                System.out.println(months.get(i));  
            }
        }

        
        System.out.println("\niterative:");
        Iterator<String> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("First Month:" + months.getFirst());
        System.out.println("Last Month:" + months.getLast());

        months.remove("June");
        System.out.println("\nremoving june:" + months);


        System.out.println("First Month: " + months.peekFirst());
        System.out.println("Last Month: " + months.peekLast());

        String firstMonth = months.pollFirst();
        String lastMonth = months.pollLast();
        System.out.println("Removed First: " + firstMonth);
        System.out.println("Removed Last: " + lastMonth);
    }
}


		


		 



