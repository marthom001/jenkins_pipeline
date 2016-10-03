//Swapping the numbers enclosing a word
//Testing again
//Pipeline first test push (as a trigger)
//Pipeline second test push
//Pipeline third test push
//Pipeline fourth test push
//Pipeline fifth test push
public class SwapNumbers {

	public static void main(String[] args) {

		String line = "4Always0 5look8 4on9 7the2 4bright8 9side7 3of8 5life5";
		String[] allWords = line.split(" ");

		for (int i = 0; i < allWords.length; i++) {
			String s = allWords[i];
			String newWord = s.charAt(s.length() - 1) 
							+ s.substring(1, s.length() - 1) 
							+ s.charAt(0);
			System.out.print(newWord + " ");
		}
	}
}
