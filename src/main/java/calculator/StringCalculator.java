package calculator;

class StringCalculator {

//  kata Test  ---> semi colon separator
	// Total tests run: 6, Passes: 6, Failures: 0, Skips: 0

	private final String delimiter = ",|\n|;"; 
	 public int add(String input) throws Exception { 
	 String[] numbers = input.split(delimiter);
	  if(isEmpty(input)) { 
	  return 0; 
	  } 
	  if(input.length()==1) {
	   return stringToInt(input);
	    } 
	    return getSum(numbers); 
	    } 
	    private int getSum(String[] numbers) throws Exception { 
	    for (String current:numbers) {
	  if(stringToInt(current)<0) { 
	  throw new Exception ("negatives not allowed"); 
	  }
	  } 
	  int sum=0; 
	  for (String current:numbers) { 
	  sum=sum+stringToInt(current); 
	  }
	  return sum;
	   } 
	   private boolean isEmpty(String input) {
	    return input.isEmpty();
	  
	  }
	  
	  private int stringToInt(String input) { 
	  return Integer.parseInt(input);
	   }
}