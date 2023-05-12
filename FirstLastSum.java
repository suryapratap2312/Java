
public class FirstLastDigitSum {

  public static void main (String [] args) {
  
    System.out.println(sumFirstAndLastDigit (number: 252) );
  
  }// end of main method
  
  public static int sumFirstAndLastDigit( int number){
        
        if (number < 0){
            return -1;
        }
        
        int lastDigit = number % 10;
        
        while( number >= 10){
            number /= 10;
            
        }
        
        return (number + lastDigit);
        
    } // end of sumFirstAndLastDigit method

}// end of main class
