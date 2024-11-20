// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String inputString = args[0].toUpperCase();  
                   int numCheers = Integer.parseInt(args[1]);           
                 String specialLetters = "AEFHILMNORSX";
                  for (int i = 0; i < inputString.length(); i++) {
                    char letter = inputString.charAt(i); 
                    
                  if (specialLetters.indexOf(letter) != -1) {
                   System.out.println("Give me an " + letter + ": " + letter + "!");
                  } else {
                      System.out.println("Give me a " + letter + ": " + letter + "!");
              }
                }    
                    System.out.println("What does that spell?");
                  for (int i = 0; i < numCheers; i++) {
                    System.out.println(inputString + "!!!");
                   }
           }
}       
