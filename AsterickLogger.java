package week05CodingAssignment;

public class AsterickLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}//end of log

	@Override
	public void error(String error) {
		System.out.println("***************"
				+ 			"\n***Error: " + error +"***"
						+  "\n***************");
	}//end of error

}//end of class
