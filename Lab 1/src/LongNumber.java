/*
 * Matthew Hickey
 * 
 * 
 * This class manages one long number and has methods to add, subtract, and multiply such numbers
 * 
 * 
 */
public class LongNumber {

	private String theNumber;
	
	public LongNumber(String s) {
		theNumber = s;
	}
	
	public String getNumber() {
		return theNumber;
	}
	
	public String toString() {
		return "The long number is: " + theNumber;
	}
	
	public int getSize() {
		return theNumber.length();
	}
	
	public int getSumOfDigits() {
			int sumOfDigits = 0;
			for (int i = 0; i < theNumber.length(); i++) {
				sumOfDigits += theNumber.charAt(i) - '0';
			}
		return sumOfDigits;
	}
	

	public static LongNumber add(String number, String number2) {
		String resultString = "";
		LongNumber result = new LongNumber("");
		
		int sumOfDigits, carry = 0, val;
		
		int v1 = 0, v2 = 0;
		
		int indexRange = number.length();
		
		if(number2.length() > indexRange) {
			indexRange = number2.length();
		}
		
		for (int i = 0; i < indexRange; i++) {
			if (number.length() - 1 - i >= 0) {
				v1 = (number.charAt(number.length()-1-i) - '0');
			} else {
				v1 = 0;
			}
			
			if (number2.length() - 1 - i >= 0) {
				v2 = (number2.charAt(number2.length()-1-i) - '0');
			} else {
				v2 = 0;
			}
			sumOfDigits = v1 + v2 + carry;
			
			val = sumOfDigits % 10;
			
			resultString = val + resultString;
			
			carry = sumOfDigits / 10;
			
			if (i == (indexRange -1) && carry > 0) {
				resultString = carry + resultString;
			}
			
		}
		System.out.println(resultString);
		
		result.setNumber(resultString);
		return result;
	}
	
	public static LongNumber subtract(String number, String number2) {
		String resultString = "";
		LongNumber result = new LongNumber("");
		
		int diffOfDigits, carry = 0, val;
		
		int v1 = 0, v2 = 0;
		
		int indexRange = number.length();
		
		
		if(number2.length() > indexRange) {
			indexRange = number2.length();
		}
		
		for (int i = 0; i < indexRange; i++) {
			if (number.length() - 1 - i >= 0) {
				v1 = (number.charAt(number.length()-1-i) - '0');
			} else {
				v1 = 0;
			}
			
			if (number2.length() - 1 - i >= 0) {
				v2 = (number2.charAt(number2.length()-1-i) - '0');
			} else {
				v2 = 0;
			}
			diffOfDigits = v1 - v2 + carry;
			
			if (diffOfDigits >= 0) {
				carry = 0;
				val = diffOfDigits;
			} else {
				carry = -1;
				val = 10 - diffOfDigits;
			}
			
			resultString = val + resultString;
			
			if (carry > 0) {
				resultString = carry + resultString;
			}
			
		}
		
		while (resultString.length() > 1) {
			if (resultString.charAt(0) - '0' == 0) {
				int strLength = resultString.length();
				resultString = resultString.substring(1, strLength);
			} else {
				break;
			}
		}
		
		System.out.println("answer " + resultString);
		
		result.setNumber(resultString);
		return result;
	}
	
	public static LongNumber multiply(String number, String number2) {
		String resultString = "";
		LongNumber result = new LongNumber("");
		
		int mulitplication, carry = 0, val;
		
		int v1 = 0, v2 = 0;
		
		
		for (int i = 0; i < number.length(); i++) {
			String tempResult = "";
			v1 = (number.charAt(number.length()-1-i) - '0');
			for (int j = 0; j < i; j++) {
				tempResult += "0";
			}
			for (int j = 0; j < number2.length(); j++) {				
				v2 = (number2.charAt(number2.length()-1-j) - '0');
				int multiplied = (v1 * v2) + carry;
				
				val = multiplied % 10;
				
				tempResult = val + tempResult;
				
				carry = multiplied / 10;
				System.out.println("val: " + val + " carry: " + carry);
			}
			System.out.println("Add: " + resultString + " and " + tempResult);
			resultString = add(resultString, tempResult).getNumber();
			
			

			
		}
		System.out.println(resultString);
		
		result.setNumber(resultString);
		return result;
	}

	private void setNumber(String resultString) {
		theNumber = resultString;
		
	}
}
