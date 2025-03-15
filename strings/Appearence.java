import java.util.HashMap;

class Appearence{
	public static void main(String args[]){
		HashMap<Character, Integer> store = new HashMap<Character, Integer>();
		String myString = "Hello World".toLowerCase(); // There are methods here since its a class; Could also just converted this toCharArray and loop though that instead

		// To keep track for the highest appeard yet
		char highestLetter = ' ';
		int highestCount = 0;

		for(int i = 0; i < myString.length(); i++){

			char letter = myString.charAt(i);

			if (store.get(letter) != null){
				// Calculate how many times we have seen this letter
				int newHighest = store.get(letter) + 1;
				store.put(letter, newHighest);
				
				// Update our current highest value and the lettter
				if (newHighest > highestCount){
					highestCount = newHighest;
					highestLetter = letter;
				}
			}
			// We seeing the letter fot the first time
			else{
				store.put(letter, 1);
			}
		}

		System.out.println("Count: " + highestCount);
		System.out.println("Letter: " + highestLetter);
	}
}
