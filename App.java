
public class App {

	public static void main(String[] args) {
		

		
		
		
		/*
		 * 9.	Create a class named App that has a main method.
		 */
	
			
		/*
		 * 10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		 */
			// Create a new AsteriskLogger, named asteriskLogger
			AsteriskLogger asteriskLogger = new AsteriskLogger();
			//Create a new SpaceLogger named spaceLogger.
			SpacedLogger spacedLogger = new SpacedLogger();
			
			
			// Call the asteriskLogger method log and enter a string of "Hello"
			asteriskLogger.log("Hello");
			// Call the asteriskLogger method error and enter a string of "Error!"
			asteriskLogger.error("Error!");
			// Call the spacedLogger method log and enter a string of "Hello!"
			spacedLogger.log("Hello!");
			// Call the spacedLogger method error and enter a string of "Error@!"
			spacedLogger.error("Error@!");
	
		
		}

}
