
public class Main
{
	public static void main(String[] args) {
		System.out.println("Do the 2 digit numbers 23 and 45 share a number? T or F?: " + hasSharedDigit(23,45)); //Should return false;
	}
	
	public static boolean hasSharedDigit(int first, int second) {
	    if(first < 10 || second < 10 || first > 99 || second > 99) {
	        return false;
	    } else {
	            return first % 10 == second % 10 || first / 10 == second % 10 ||
                first % 10 == second / 10 || first / 10 == second / 10;
	        } 
	}
}

