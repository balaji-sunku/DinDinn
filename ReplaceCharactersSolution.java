package dindin;

public class ReplaceCharactersSolution {

	public static void main(String[] args) {

		final String input = "abz";
		final int n = 1;

		System.out.println("Result : " + replaceNChars(input, n));

	}

	static String replaceNChars(String input, int n) {

		StringBuilder result = new StringBuilder();

		int inputLength = input.length();

		for (int i = 0; i < inputLength; i++) {

			int character = input.charAt(i);

			if (character + n > 'z') {

				int distance = n - ('z' - character);
				distance = distance % 26;
				result.append((char) ('a' + distance - 1));

			} else {

				result.append((char) (character + n));

			}

		}

		return result.toString();

	}

}
