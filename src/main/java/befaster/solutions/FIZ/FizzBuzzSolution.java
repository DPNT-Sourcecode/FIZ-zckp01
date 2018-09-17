package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	 StringBuilder sb = new StringBuilder();
         if(number % 3 == 0) sb.append("Fizz");
         if(number % 5 == 0) sb.append("Buzz");

         if(Integer.toString(number).indexOf("3") != -1) sb.append("Bizz");
         if(Integer.toString(number).indexOf("5") != -1) sb.append("Fuzz");

         	if (sb.length() == 0) 
         	  return String.valueOf(number);
         	else 
        	 return sb.toString();
         }

}
