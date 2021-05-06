
public class Main
{
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(164985));
	}
	public static int getEvenDigitSum(int number) {
    if(number < 0) {
       return -1;
    } else {
       int finalSum = 0;
 
        while (number != 0) {
            
            // Get the last digit of the number using the modulo operand
            int digit = number % 10;
            
            // Check if the remainder (last number) is even.
            if (digit % 2 == 0) {
                // If it is, add it to the FINAL sum
            finalSum += digit;
            }
            // remove final digit ex; 42.'3', from number by using divide operand
           number /= 10;
        }
        // returns final sum once all numbers are removed (number == 0).
       return finalSum;
        }   
   }
}
