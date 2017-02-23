package com.strings;

import java.util.HashMap;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "loveleetcode";
		System.out.println(areAllCharsUnique1(str));
		System.out.println(areAllCharsUnique2(str));
		System.out.println(getFirstUniqChar(str));
	}
	
	// Using external data structure - HashMap<Character,Integer>
	private static boolean areAllCharsUnique1(String str){
		boolean result = true;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chars = str.toCharArray();
		int length = str.length();
		for(int i=0; i<length ; i++){
			map.put(chars[i],map.containsKey(chars[i]) ? map.get(chars[i])+1 : 1);
		}
		for(Character key : map.keySet()){
			if(map.get(key)>1)
				result = false;
		}
		return result;
		
	}
	// Using external data structure array of boolean values for all 128 chars in ASCII | extended ASCII has 256 chars though
	private static boolean areAllCharsUnique2(String str){
		boolean result = true;
		boolean[] mem = new boolean[128];
		for(int i=0; i<str.length();i++){
			if(mem[str.charAt(i)] == false)
				mem[str.charAt(i)] = true;
			else
				result = false;
		}
		return result;
	}
	
	//get the first unique character in the string -- leetcode 387
	private static int getFirstUniqChar(String str){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			map.put(chars[i], map.containsKey(chars[i])? map.get(chars[i])+1: 1);
		}

		Character resultChar = null;
		int resultKey = 0;
		for(int i = 0; i < chars.length; i++){
			if(map.get(chars[i])==1){
				resultKey = i;
				break;
			}
		}

		return resultKey;
	}

}
