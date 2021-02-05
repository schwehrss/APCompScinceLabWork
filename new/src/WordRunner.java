//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

public class WordRunner
{
	public static void main(String[] args)
	{
		   
		
		Word one = new Word("chicken");
		System.out.println(one.getName());
		System.out.println("num vowels == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength() + "\n");
	
		one.setWord("alligator");
		System.out.println(one.getName());
		System.out.println("num vowels == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength()+ "\n");
		
		one.setWord("elephant");
		System.out.println(one.getName());
		System.out.println("num vowels == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength()+ "\n");
	}
}  