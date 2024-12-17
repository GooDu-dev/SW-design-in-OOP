public class AppWithSRP {
	public static void main(String[] args) {
		System.out.println("Welcome to the Application!");
		// get a pair of values
		PairOfInput pair = PairOfInputProcessor.read();
		// check whether the inputs are valid
		if (PairOfInputProcessor.isValid(pair)) {

			int firstInt, secondInt;
			firstInt = Integer.parseInt(pair.getFirst());
			secondInt = Integer.parseInt(pair.getSecond());
			// do the mathematical operation
			Number result = MathOperation.add(firstInt, secondInt);
			System.out.println("The result is: " + result);
			Number result2 = MathOperation.minus(firstInt, secondInt);
			System.out.println("The result2 is: " + result2);
		} else {
			System.out.println("Invalid number");
		}

		System.out.println("End of the application!");
	}

}
