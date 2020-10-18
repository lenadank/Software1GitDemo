
public class FirstProgram {
	public static void main(String[] args) {
		int numToCheck = 29;
		boolean res = checkIsPrime(numToCheck);
		if (res) {
			System.out.println(numToCheck + " is a prime");
		}
		else {
			System.out.println(numToCheck + " is not a prime");
		}
	}
	
	
	public static boolean checkIsPrime(int num) {
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				return false;
			}
			i++;  // i = i+1
		}
		return true;	
	}
}
