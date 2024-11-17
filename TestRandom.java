public  class  TestRandom {
	public static void main(String[]  args) {
	   int N = Integer.parseInt(args[0]); 
	   int greaterThan = 0;
	   int lessOrEqual = 0;


	   for(int i = 0; i < N; i++){
		double random = Math.random();
		if( random > 0.5 ){
			greaterThan++;

		 } else {
			lessOrEqual++;
		 }
		}

   System.out.println("> 0.5: " + greaterThan +" times");
   System.out.println("<= 0.5: " + lessOrEqual +" times");

   double ratio = (double) greaterThan / lessOrEqual;
   if (lessOrEqual == 0) {
	System.out.println ("cannot calculate ratio");
	
   } else {
	System.out.println("Ratio:" + ratio);
   }


	}
}
