package week05CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			log.charAt(i);
			System.out.print(log.charAt(i) + " ");
		}//end of for loop
		
	}//end of log

	@Override
	public void error(String error) {
		char[] characters = new char[error.length()];
		for (int i = 0; i < error.length(); i++) {
			characters[i] = error.charAt(i);	
	}//end of for loop
		System.out.print("\nERROR: ");
		for (char c : characters) {
			System.out.print(c + " ");
		}
}//end of error
}//end of class
