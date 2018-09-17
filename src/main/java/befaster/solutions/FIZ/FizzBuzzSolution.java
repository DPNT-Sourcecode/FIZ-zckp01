package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
   	    StringBuilder sb = new StringBuilder();
        if(number % 3 == 0 || Integer.toString(number).indexOf("3") != -1) sb.append("fizz");
        if(number % 5 == 0 || Integer.toString(number).indexOf("5") != -1) sb.append(" buzz");

     	if (sb.length() == 0) 
     	  return String.valueOf(number);
     	else 
    	 return sb.toString().trim();
    }

}
