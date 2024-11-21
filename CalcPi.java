// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
				int numTerms = Integer.parseInt(args[0]);
				double piApproximation = 0.0;
		
				for (int i = 0; i < numTerms; i++) {
					double denominator = 2 * i + 1;
					if (i % 2 == 0) {
						piApproximation += 1 / denominator;
					} else {
						piApproximation -= 1 / denominator;
					}
				}
		
				piApproximation *= 4;
				System.out.println("pi according to Java: " + Math.PI);
				System.out.println("pi, approximated: " + piApproximation);		
	}
}
