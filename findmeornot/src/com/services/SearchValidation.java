package com.services;

import java.util.regex.Pattern;

public class SearchValidation {

	public static final String NULL_VALIDATION_MSG = "Animal Name should not be empty";
	public static final String SPECIAL_CHAR_VALIDATION_MSG = "Animal Name should not contain special characters or numbers";

	public static Validation isValid(String animal) {
		Validation val = new Validation();
		val.setIsvalid(true);

		if (animal.isEmpty()) {
			val.setIsvalid(false);
			val.setMessage(NULL_VALIDATION_MSG);
		} else {
			final Pattern pattern = Pattern.compile("^[A-Za-z]+$");
			if (!pattern.matcher(animal).matches()) {
				val.setIsvalid(false);
				val.setMessage(SPECIAL_CHAR_VALIDATION_MSG);
			}

		}
		return val;
	}

	static class Validation {

		private String message;
		private boolean isvalid;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public boolean isIsvalid() {
			return isvalid;
		}

		public void setIsvalid(boolean isvalid) {
			this.isvalid = isvalid;
		}
	}

}