

/*
 * 3.	Create two classes that implement the Logger interface
 */

	public class SpacedLogger {


	


	/*
	 * 6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
	 */
	
	/*
	 * 7.	If the log method received “Hello” as an argument, it should print H e l l o
	 */
		
		// Method log that will take a string
		public void log(String str) {
		// StringBuilder to make a new string
		StringBuilder log = new StringBuilder();
		//For loop that will iterate for the length of the str or string inputed
		for (int i = 0; i < str.length(); i++) {
			// This will put a space between each char in the str
			log.append(str.charAt(i) + " ");
		}
		//Print out our stringbuilder
		System.out.println(log);

		}
	
	/*
	 * 8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	 */
		
		// A method that will do the same as log, so we will reuse log, this method will take a string
		public void error(String str) {
			//This will print our "ERROR: " but not use println, so the word will stay on the same line
			System.out.print("ERROR: ");
			// Use log to put a space between.
			log(str);
			}
	
	
	
	
	
}
