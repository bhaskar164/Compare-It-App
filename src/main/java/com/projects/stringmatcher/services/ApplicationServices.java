package com.projects.stringmatcher.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServices{

	public int compareStrings(String original, String toCompare) {
		ArrayList<Integer> unmatchedIndeces = null;
		if (original != null && toCompare != null) {
			unmatchedIndeces = new ArrayList<>();
//			int st=0;
//			int end=0;
			for(int i=0,j=0;i<original.length() && j<toCompare.length();i++,j++) {
//				for(int j=0;j<toCompare.length();j++) {
//					if(original.charAt(i+j) == toCompare.charAt(j)){
//						/*
//						 * O:- Elski Simba
//						 * D:- elski simba
//						 * 
//						 */						
//						}
				if(original.charAt(i) != toCompare.charAt(j)) {
					unmatchedIndeces.add(j);
				}
			}
			for(Integer x: unmatchedIndeces) {
				System.out.println("val: "+x);
			}
		}
		return -1;
	}
}



/*
 * s1-> Far from home
 * s2-> next to home 
 * Approach 1:-
 * Compare every character of s1 with s2 
 */