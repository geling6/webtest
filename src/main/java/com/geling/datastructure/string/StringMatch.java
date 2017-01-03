package com.geling.datastructure.string;

public class StringMatch {
	
	//普通的匹配算法
	public static int index(char[] s, char[] t, int pos){
		int i = pos,j = 1;
		int count = 0;
		while(i<=s.length-1 && j<=t.length-1){
			count++;
			if(s[i] == t[j]){
				i++;
				j++;
			}else{
				i = i-j+2;
				j = 1;
			}
		}
		System.out.println(count);
		if(j>t.length-1) return i-t.length+1;
		
		return 0;
	}
	
	public static void main(String[] args) {
		char[] s = new char[]{'0','a','b','a','b','c','a','b','c','a','c','a','b','z','a'};
		char[] t = new char[]{'0','a','b','c','a','c'};
		
		System.out.println(index(s,t,1));
	}
}
