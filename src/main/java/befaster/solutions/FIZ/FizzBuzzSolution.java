package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	
    	
//    	  - A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
//    	  - A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
//    	  - We should still say "fake deluxe" if the "deluxe" number is odd
//    	  - A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
//    	  - All the previous rules for "fizz" and "buzz" are still valid    	
    	
    	String num = Integer.toString(number);
    	boolean isDeluxe = false;
   	    StringBuilder sb = new StringBuilder();
        if(number % 3 == 0 || num.indexOf("3") != -1) {
        	sb.append("fizz");
        	isDeluxe = true;
        }
        if(number % 5 == 0 || num.indexOf("5") != -1) {
        	sb.append(" buzz");
        	isDeluxe = true;
        }
        
        if (isDeluxe) {
	        if (number%2 != 0) 
	        	sb.append(" fake deluxe");
	        else	
	        	sb.append(" deluxe");
        }    
        
     	if (sb.length() == 0) 
     	  return String.valueOf(number);
     	else 
    	 return sb.toString().trim();
    }

}
