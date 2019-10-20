package org.openshift;

import java.util.Random;

public class InsultGenerator {
	public String generateInsult() {
		String words[][] = {{"Artless", "Mother Fuckers", "Fuckers"}, {"Base-court", "Bat-fowling", "Beef-witted"}, {"Apple-john", "Baggage", "Barnacle"}};
		String vowels = "AEIOU";
		String article = "an";
		String firstAdjective = words[0][new Random().nextInt(words[0].length)];
		String secondAdjective = words[1][new Random().nextInt(words[1].length)];
		String noun = words[2][new Random().nextInt(words[2].length)];
		if (vowels.indexOf(firstAdjective.charAt(0)) == -1) {
			article = "a";
		}
		return String.format("Issawi Edited art %s %s %s %s!", article, firstAdjective, secondAdjective, noun);
	}

}
