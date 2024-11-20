// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
				
				int N = Integer.parseInt(args[0]);
				int greaterThanHalf = 0;
				int lessThanOrEqualToHalf = 0;
		
				for (int i = 0; i < N; i++) {
					double randomValue = Math.random();
					if (randomValue > 0.5) {
						greaterThanHalf++;
					} else {
						lessThanOrEqualToHalf++;
					}
				}
				System.out.println("> 0.5: " + greaterThanHalf + " times");
				System.out.println("<= 0.5: " + lessThanOrEqualToHalf + " times");
					double ratio = (double) greaterThanHalf / lessThanOrEqualToHalf;
					System.out.println("Ratio: " + ratio);
				}		
	}
