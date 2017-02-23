package com.strings;

import java.util.HashMap;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPermutation("prithvi","ravi"));
	}
	
	private static boolean checkPermutation(String str1, String str2){
		boolean result = false;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chars = str1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			map.put(chars[i], map.containsKey(chars[i])? map.get(chars[i])+1: 1);
		}
		
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		char[] chars2 = str2.toCharArray();
		for (int i = 0; i < chars2.length; i++) {
			map2.put(chars2[i], map2.containsKey(chars2[i])? map2.get(chars2[i])+1: 1);
		}
		System.out.println(map);
		System.out.println(map2);
		int count = 0;
		for(Character key : map.keySet()){
			if(map.get(key)==map2.get(key)){
				count++;
			}
		}
		if(count == map.keySet().size())
			result = true;
		return result;
	}

}
