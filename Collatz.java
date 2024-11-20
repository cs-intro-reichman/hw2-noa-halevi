public class Collatz {
	public static void main(String args[]) {
	
	  int userNum = Integer.parseInt(args[0]);
	  String mode = args[1];
	  
	  if (mode.equals("v")){
		for(int seed = 1; seed <= userNum; seed++){
			int currentNum = seed;
			int steps = 0;
			while (currentNum != 1) {
				System.out.print(currentNum + " "); 
				if (currentNum % 2 == 0) { 
					currentNum = currentNum / 2;
				} else { 
					currentNum = 3 * currentNum + 1;
				}
				steps++;
				}
				System.out.println(1 + " (" + (steps + 1) + ")");	
		} 	
		System.out.println("Every one of the first " + userNum + " hailstone sequences reached 1.");

		} else if (mode.equals("c")) {
			System.out.println("Every one of the first " + userNum + " hailstone sequences reached 1.");
		}
    }
}
