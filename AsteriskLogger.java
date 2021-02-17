
/*
 * 3.	Create two classes that implement the Logger interface
 */

public class AsteriskLogger {



	/*
	 * 4.	The log method on the AsteriskLogger should print out the String it receives between 3 
	 * asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should 
	 * print ***Hello*** to the console.
	 * 
	 */
	
	// Method log that will take a String and place asterisks around that string
	public void log(String str) {
		//Print out *** STRING ***
		System.out.println("***" + str + "***");
	}
	
	
	/*
	 * 5.	The error method on the AsteriskLogger should print the String it receives inside a box of 
	 * asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the 
	 * argument, the following should be printed
	 */
	
	
	// Method that will put a box of * around a string.
	
	public void error(String str) {
		//This will set the string to error so we can get the strings length, and adds the string in the middle
		String error = "Error: " + str;
		// Will store length of the error string and give it plus 6 for the number of * surrounding it to match the log string.
		int length = error.length() + 6;
		// Create a string builder to hold the new string
		StringBuilder line = new StringBuilder();
		//for loop that will append the the length of our Stringbuilder line with *
		for (int i = 1; i <= length; i++) {
			line.append('*');
		}
		
		//Print line of * + 6 
		System.out.println(line.toString());
		// Will use the log method to take our line Stringbuilder 
		log(error);
		//Print line of * + 6 
		System.out.println(line.toString());

	}


}
