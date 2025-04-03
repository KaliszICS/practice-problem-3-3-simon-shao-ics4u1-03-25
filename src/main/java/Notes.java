import java.util.ArrayList;

class Notes {
	public static void main(String[] args) {

	}

	public static int factorial(int num) {

		if (num < 0) {
			return 0;
		}

		return factorialHelper(num);
	}

	public static int factorialHelper(int num) {

		//base case
		if (num == 0) {
			return 1;
		}

		return factorialHelper(num - 1) * num;

	}

	public static ArrayList<String> permutations(String word) {

		ArrayList<String> perms = new ArrayList<String>();
		permutationsHelper("", word, perms);
		return perms;
	}

	public static void permutationsHelper(String usedLetters, String unusedLetters, ArrayList<String> perms) {
		//write permutations code here
	}
//?
}
