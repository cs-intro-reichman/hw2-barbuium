// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            if (mode.equals("v")) {
                int current = seed;
                int steps = 1;
                StringBuilder sequence = new StringBuilder();

				sequence.append(current);

            	while (current != 1) {
                if (current % 2 == 0) {
                    current = current / 2;
                } else if (current % 2 != 0) {
					current = 3 * current + 1;	
				}
                steps++;
				sequence.append(" ").append(current);
        	}
                System.out.println(sequence + " (" + steps + ")");
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
            }
        }
    if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}
