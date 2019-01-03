/*
 * Hemantha Akkaraju
 * CSE 143
 * Assignment 1: This program implements a class called LetterInventory that can be used 
 * to keep track of an inventory of letters of the alphabet. The constructor for the
 * class takes a String and computes how many of each letters are in the String. This
 * is the information that the object keeps track of. It ignores the case of the letters
 * and ignores anything that is not an alphabetic character.  
 */
public class LetterInventory {
	private String data;
	private int count;
	
	public LetterInventory(String data) {
		this.data = data;
	}
	
	public int get(char letter) {
		for(int i = 0; i < data.length(); i++) {
			if(!Character.isAlphabetic(letter)) {
				throw new IllegalArgumentException();
			}
			if (data.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}
	
	public void set(char letter, int value ) {
		if(!Character.isAlphabetic(letter) || value < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public int size() {
		return this.count;
		
	}
	
	public boolean isEmpty() {
		return false;
		
	}
	public String toString() {
		return "[" + this.count + "]";
	}
	
	public LetterInventory add(LetterInventory other) {
		return other;
	}
	
	public LetterInventory subtract(LetterInventory other) {
		return other;
	}
	
}
