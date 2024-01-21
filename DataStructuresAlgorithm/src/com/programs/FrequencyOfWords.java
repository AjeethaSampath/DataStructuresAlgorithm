package com.programs;

import java.util.Arrays;

public class FrequencyOfWords {
	 public static int[] numSmallerByFrequency(String[] queries, String[] words) {
		 int j=0;
		 int[] resArr = new int[queries.length];
	        for(String query:queries) {
	        	int result =0;
	        	for(String word:words) {
	        		if(frequency(query)<frequency(word)) {
	        			result++;
	        		}
	        	}
	        	resArr[j] = result;
	        	j++;
	        }
	        return resArr;
	    }
	 public static int frequency(String word) {
		 int count =0;
		 char[] characterWord = word.toCharArray();
		 Arrays.sort(characterWord);
		 for(int i=0;i<characterWord.length;i++) {
			 if(characterWord[0] == characterWord[i]) {
				 count++;
			 }
			 else {
				 break;
			 }
		 }
		 return count;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] queries = {"bbb","cc"};
		String[] words = {"a","aa","aaa","aaaa"};
		int[] result = numSmallerByFrequency(queries, words);
		System.out.println(Arrays.toString(result));

	}

}
