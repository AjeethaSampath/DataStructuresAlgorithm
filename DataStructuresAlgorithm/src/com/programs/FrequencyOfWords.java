package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
	 public static String frequencySort(String s) {
	        char[] ch = s.toCharArray();
	        Map<String,Integer> unsortedMap = new HashMap<>();
	        int count =0;
	        String resultStr = "";
	        Map<String,Integer> sortedMap = new LinkedHashMap<>();
	        for (int i=0;i<ch.length;i++) {
	        	if(!unsortedMap.containsKey(String.valueOf(ch[i]))) {
	        		
	        	count =0;	
	        	count++;
	        		unsortedMap.put(String.valueOf(ch[i]), count);
	        
	        }
	        	else {
	        		System.out.println(unsortedMap.get(String.valueOf(ch[i])));
	        		count = unsortedMap.get(String.valueOf(ch[i]));
	        		count++;
	        		unsortedMap.replace(String.valueOf(ch[i]), count);
	        	}
	        }
	        System.out.println(unsortedMap);
	        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
	        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
	        for(Map.Entry<String, Integer> entry:entryList) {
	        	sortedMap.put(entry.getKey(), entry.getValue());
	        }
	        System.out.println(sortedMap);
	        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
				String key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key+val);
				while(val>0) {
					resultStr+=key;
					//resultStr.concat(key);
					//System.out.println(resultStr);
					val--;
				}
			}
	        System.out.println(resultStr);
	        return resultStr;
	    }
	 public static int[] topKFrequent(int[] nums, int k) {
		 	int[] result = new int[k];
		 	int count =0;
		 	int j=0;
		 	Map<Integer,Integer> mapInt = new HashMap<>();
	        for(int i=0;i<nums.length;i++) {
	        	if(!mapInt.containsKey(nums[i])) {
	        		count =0;
	        		count++;
	        		mapInt.put(nums[i], count);
	        	}
	        	else {
	        		count = mapInt.get(nums[i]);
	        		count++;
	        		mapInt.replace(nums[i], count);
	        	}
	        }
	        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mapInt.entrySet());
	        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
	       Map<Integer,Integer> sortedMap = new LinkedHashMap<>();
	       for (Map.Entry<Integer, Integer> entry : entryList) {
	    	   if(k>0) {
	    		   
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			result[j] = entry.getKey();
			k--;
			j++;	
			}
			
		}
	      return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] queries = {"bbb","cc"};
		String[] words = {"a","aa","aaa","aaaa"};
		String str = "raaeaedere";//zzzzbbbeert
		//int[] result = numSmallerByFrequency(queries, words);
		//System.out.println(Arrays.toString(result));
		//System.out.println(frequencySort(str));
		int[] input = {1,1,2,2,3,2,2,2,4,5,5,5,5};
		int key = 2;
		System.out.println(Arrays.toString(topKFrequent(input, key)));

	}

}
