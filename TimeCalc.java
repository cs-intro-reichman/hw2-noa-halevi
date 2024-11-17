public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        if (hours < 0 || hours > 24) {
            System.out.println("Invalid hours value. Hours must be between 00 and 24.");
            return; 
        }    
        
        if (minutes < 0 || minutes > 59) {
            System.out.println("Invalid minutes value. Minutes must be between 00 and 59.");
            return; 
        }
        
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (( hours * 60 ) + minutes + minutesToAdd );
        int totalHours = ( totalMinutes / 60);
        int newHours = (totalHours % 24);
        int newMinutes = totalMinutes - ( totalHours * 60);

      
        if (newHours == 24){
            if (newMinutes < 10) {
                System.out.println( "00:0" + newMinutes);
            } else {
                System.out.println("00:" + newMinutes);
            }
        } else if (newHours < 10 ) {
            if (newMinutes < 10){
                System.out.println("0" + newHours + ":0" + newMinutes);
            }  else {
                System.out.println("0" + newHours + newMinutes);                 
         } 
        } else { 
            if (newMinutes < 10) {
                System.out.println(newHours + ":0" + newMinutes);
            } else {
                System.out.println(newHours + ":" + newMinutes);
                
            }
        }   

    }

 }
        








