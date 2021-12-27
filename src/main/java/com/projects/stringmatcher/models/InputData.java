package com.projects.stringmatcher.models;

import org.springframework.stereotype.Component;

@Component
public class InputData {
	String originalString = "";
	String duplicateString = "";

	public String getOriginalString() {
		return originalString;
	}

	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}

	public String getDuplicateString() {
		return duplicateString;
	}

	public void setDuplicateString(String duplicateString) {
		this.duplicateString = duplicateString;
	}

}
