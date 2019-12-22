package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> s = new ArrayList<String>();
		//2. Add five Strings to your list
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			String string = s.get(i);
		//	System.out.println(string);
			
		}
		
		//4. Print all the Strings using a for-each loop
		for(String each:s) {
			//System.out.println(each);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			String s2 = s.get(i);
			if(i%2==0) {
				//System.out.println(s2);
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			String s2 = s.get(i);
			//System.out.println(s2);
		
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			String s2 = s.get(i);
			if(s2.contains("e")) {
				System.out.println(s2);
			}
			
			
		}
	}
}
