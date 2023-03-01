package data;

import java.util.*;

public class findUniqueWord {
	
	 public static List<String> findUnique(List<String> list){
		 
		 List<String> unique = new LinkedList<>();
		 for (String el : list) {
			if(!unique.contains(el)) {
				unique.add(el);
			}
			
		}
		 
		 return unique;
		 
		 
	 }

	 public static void main(String[] args) {
		
		 String[] words = {"hi" , "hello" , "umt" , "hi"};
		 List<String> myWords = Arrays.asList(words);

		 List<String> uniqueList = findUnique(myWords);
		 System.out.println(uniqueList);
	}
	 
	

	
	

}
