

import java.util.HashMap;

public class DuplicateCharacter {

	private String word;

	public String getWord() {
		return word;
	}

	public String setWord(String word) {
		return this.word = word;
	}

	public static Character findDuplicateCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<>();
		Character maxchar = ' ';

		long max = Integer.MIN_VALUE;

		for (int i = 0; i < str.length(); i++) {
			Character current = str.charAt(i);

			if (map.containsKey(current)) {
				map.put(current, map.get(current) + 1);
			} else {
				map.put(current, 1);
			}

			if (map.get(current) > max) {
				maxchar = current;
				max = map.get(current);
			}
		}
		System.out.print(max);

		return maxchar;

	}
}
