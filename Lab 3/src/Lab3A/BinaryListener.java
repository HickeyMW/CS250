package Lab3A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;

public class BinaryListener implements ActionListener{
	
	BinaryGui binaryGui;
	
	public void setGui(BinaryGui binaryGui) {
		this.binaryGui = binaryGui;
	}

	
	public static String add(String number, String number2) {
		String resultString = "";
		
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
			
			if (sumOfDigits == 2) {
				carry = 1;
			} else {
				carry = 0;
			}
			
			val = sumOfDigits % 2;
			
			resultString = val + resultString;
			
			if (i == (indexRange -1) && carry > 0) {
				resultString = carry + resultString;
			}
			
		}
		System.out.println(resultString);
		
		
		return resultString;
	}

	public static String subtract(String number, String number2) {
		String resultString = "";
		
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
				val = 1;
			}
			
			resultString = val + resultString;
			
			if (i == (indexRange -1) && carry > 0) {
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
		
		return resultString;
	}
		
	public static String multiply(String number, String number2) {

		String resultString = "";
		
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
			resultString = add(resultString, tempResult);
			
			

			
		}
		System.out.println(resultString);
		
		return resultString;
	}

	public static String divide(String number, String number2) {
		BigInteger big1 = new BigInteger(number, 2);
		BigInteger big2 = new BigInteger(number2, 2);
		BigInteger result = big1.divide(big2);
		return result.toString(2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clicked = (JButton)e.getSource();
		String text = clicked.getText();
		
		if (text == "+") {
			binaryGui.output.setText(add(binaryGui.input1.getText(), binaryGui.input2.getText()));
		} else if (text == "-") {
			binaryGui.output.setText(subtract(binaryGui.input1.getText(), binaryGui.input2.getText()));
		} else if (text == "*") {
			binaryGui.output.setText(multiply(binaryGui.input1.getText(), binaryGui.input2.getText()));
		} else if (text == "/") {
			binaryGui.output.setText(divide(binaryGui.input1.getText(), binaryGui.input2.getText()));
		}
		
	}
}
