// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

	    String s = args[0].toUpperCase();
            int number = Integer.parseInt(args[1]);

            for (int i = 0; i < s.length(); i++){
                char userChar = s.charAt(i);

                if ("AEFHILMNORSX".indexOf(userChar) != -1) {
                        System.out.println("Give me an " + userChar + ": " + userChar + "!" );
                       
                } else {
                        System.out.println("Give me a " + userChar + ": " + userChar +"!" );
                }
                        
                }

                {
                        System.out.println("What does that spell?");  
                }
                
                for (int j = 0; j < number; j++) {
                        System.out.println(s + "!!!");
                }
                
            }
        

        }
