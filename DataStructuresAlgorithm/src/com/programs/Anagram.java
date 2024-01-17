package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
        boolean valid = false;
        
        String[] firstString = s.split("");
        String[] secondString = t.split("");
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        System.out.println(Arrays.toString(firstString));
        System.out.println(Arrays.toString(secondString));
        if(Arrays.toString(firstString).equals(Arrays.toString(secondString))) {
        	valid = true;
        }
        return valid;
    }

public static List<List<String>> groupingAnagram(String[] str){
	Map<String,List<String>> resultMap = new HashMap<>();
	for(String inputString : str) {
		char[] characterString = inputString.toCharArray();
		Arrays.sort(characterString);
		String sortedString = new String(characterString);
		if(!resultMap.containsKey(sortedString))
		resultMap.put(sortedString, new ArrayList<>());
		resultMap.get(sortedString).add(inputString);
		
		
	}
	return new ArrayList<>(resultMap.values());
}
public static List<String> removeAnagrams(String[] words){
	String previous = "";
	List<String> finalList = new ArrayList<>();
	for(int i=0;i<words.length;i++) {
		char[] inputCharacter = words[i].toCharArray();
		Arrays.sort(inputCharacter);
		String current = String.valueOf(inputCharacter);
		if(!previous.equals(current)) {
			finalList.add(words[i]);
			previous = current;
		}
			
	}
	return finalList;
			
}
public static void main(String[] args) {
	//System.out.println(isAnagram("anagram","aagaram"));
	String[] strgs = {"abba","baba","aabb","cc","cc","a",""};
	//System.out.println(groupingAnagram(strgs));
	System.out.println(removeAnagrams(strgs));
}
}
