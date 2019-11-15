package com.swen6301.builder.util;

import java.util.Random;

public class RandomUtils {
	
	/**
	 * An instance of {@link Random} that will be used in generating random identifiers in encolsed methods.
	 */
	private final static Random RANDOM = new Random(System.currentTimeMillis());
	
	/**
	 * A private constructor to prevent accidental instantiations of this class.
	 */
	private RandomUtils() {
		throw new IllegalAccessError("Cannot instantiate instance for RandomUtils class");
	}

	/**
	 * Retrieves a randomized {@link String} of size between 5-10 and the first letter is capitalized.
	 * 
	 * @return A random {@link String}. The returned {@link String} could be <code>null</code>.
	 */
	public static String randomIdentifier() {
		String lexicon = "abcdefghijklmnopqrstuvwxyz";
		if(RANDOM.nextBoolean()) {
			return null;
		}
		int length = RANDOM.nextInt(6) + 5;
	    StringBuilder builder = new StringBuilder();
	    for(int i = 0; i < length; i++) {
	    	int position = RANDOM.nextInt(lexicon.length());
	    	char c = lexicon.charAt(position);
	    	if(i == 0) {
	    		c = Character.toUpperCase(c);
	    	}
	    	builder.append(c);
	    }
	    
	    return builder.toString();
	}
	
	/**
	 * Generates a random number within the given <code>bound</code>.
	 * 
	 * @param bound An integer to bound the random generations (exclusive).
	 * @return An random number.
	 */
	public static int randomNumber(int bound) {
		return RANDOM.nextInt(bound);
	}
	
	/**
	 * Generates a random boolean.
	 * 
	 * @return a random boolean.
	 */
	public static boolean randomBoolean() {
		return RANDOM.nextBoolean();
	}
	
	/**
	 * Generates a random {@link String} for blood type.
	 * 
	 * @return a random blood type {@link String}.
	 */
	public static BloodType randomBloodType() {
		int pick = RANDOM.nextInt(BloodType.values().length);
		return BloodType.values()[pick];
	}
	
	/**
	 * Generates a random {@link String} for sex types.
	 * 
	 * @return a random sex type {@link String}.
	 */
	public static Sex randomSexString() {
			
		int pick = RANDOM.nextInt(Sex.values().length);
		return Sex.values()[pick];
	}
	
}
