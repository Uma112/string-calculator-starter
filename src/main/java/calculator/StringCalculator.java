package calculator;

class StringCalculator {

//  kata Test  --->  3
	
    public int add(String input) {
 	   String[] numbers = input.split(",");
 	 if(isEmpty(input)) {
 	  return 0;
 	    } 
 	    if(input.length()==1) {
 	     return stringToInt(input); 
 	     } return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]); 
 	     } 
 	     private boolean isEmpty(String input) {
 	      return input.isEmpty();
 	  	  }
 	  
 	  private int stringToInt(String input) { 
 	  return Integer.parseInt(input); 
 	  }
}