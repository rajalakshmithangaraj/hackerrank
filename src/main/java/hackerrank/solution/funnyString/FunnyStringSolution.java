package hackerrank.solution.funnyString;

import java.io.IOException;

public class FunnyStringSolution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    		if (s != null) {
	    		String reversedString = new String();
	    		// Reverse the given String
	    		for (char c : s.toCharArray()) {
	    			reversedString = c + reversedString;
	    		}
	    		
	    		// Iterate through each character to get Ascii values.
	    		for (int index = 0; index < s.length() - 2; index++) {
	    			
	    			// Calculate the difference in ascii value and convert negative difference to positve using Math.abs().
	    			int value = Math.abs(s.charAt(index) - s.charAt(index+1));
	    			int reversedValue = Math.abs(reversedString.charAt(index) - reversedString.charAt(index+1));
	    			
	    			// The length of the strings are equal, check the value in each position 
	    			if (value != reversedValue) {
	    				return "Not Funny";
	    			}
	    		}
    		}
		return "Funny";
    }

	public static void main(String[] args) throws IOException {

		String case1 = "abxy";
		String result = timeConversion(case1);
		System.out.println(result);
		
		String case2 = "bcxz";
		result = timeConversion(case2);
		System.out.println(result);

	}
}

