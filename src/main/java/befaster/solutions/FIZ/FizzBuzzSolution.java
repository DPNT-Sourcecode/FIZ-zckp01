package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	String num = Integer.toString(number);
   	    StringBuilder sb = new StringBuilder();
        if(number % 3 == 0 || num.indexOf("3") != -1) sb.append("fizz");
        if(number % 5 == 0 || num.indexOf("5") != -1) sb.append(" buzz");
        
        if (number > 10 && num.matches("^([0-9])\\1*")) {
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
