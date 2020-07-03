package kates;

public class FirstKate {

	int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

	public static String createPhoneNumber(int[] numbers) {
		    String result = "";
		    //int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		    for (int i = 0; i < numbers.length; i++) {
		        if (i == 0) 
		            result += '(';
		        else if (i == 3) 
		            result += ") ";
		        else if (i == 6) 
		            result += '-';

		        result += numbers[i];
		    }
		    return result;
	}
}
	
		
	 
	

