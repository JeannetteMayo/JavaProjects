
public class Main
{
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(126));
	}
	public static int sumFirstAndLastDigit(int number) {
	    if(number < 0) {
	        return -1;
	    }
	    
	    int lastDigit = number % 10; // Returns lastdigit
	    int firstDigit = 0;
	    
	    while(number > 0) {
	        firstDigit = number % 10;
	        number /= 10;
	    }
	    return lastDigit + firstDigit;
	}
}
