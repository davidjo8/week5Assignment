package week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsterickLogger();
		Logger logging = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Hello");
		logging.log("Salutations");
		logging.error("Salutations");
		
		

	}

}
