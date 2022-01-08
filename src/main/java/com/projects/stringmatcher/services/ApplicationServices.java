package com.projects.stringmatcher.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

	public String compareStrings(String original, String toCompare) {
		ArrayList<Integer> unmatchedIndeces = null;
		if (original != null && toCompare != null) {
			unmatchedIndeces = new ArrayList<>();
			for (int i = 0, j = 0; i < original.length() && j < toCompare.length(); i++, j++) {
				if (original.charAt(i) != toCompare.charAt(j)) {
					unmatchedIndeces.add(j);
				}
			}
			for (Integer x : unmatchedIndeces) {
				System.out.println("val: " + x);
			}
		}
		return modifyStringUsingSpan(unmatchedIndeces, toCompare);
	}

	private String modifyStringUsingSpan(ArrayList<Integer> unmatchedIndeces, String toCompare) {
		String resultString = "";
		for (int i = 0; i < toCompare.length(); i++) {
			if (unmatchedIndeces.contains(i)) {
				resultString += "<span style=\"background-color:#ff001d;\">";
				resultString += toCompare.charAt(i) + "</span>";
			} else {
				resultString += toCompare.charAt(i);
			}

		}
		System.out.println("DATA:" + resultString);
		return resultString;
	}
}

/*
 * s1-> Far from home s2-> next to home Approach 1:- Compare every character of
 * s1 with s2
 */