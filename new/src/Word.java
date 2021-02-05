//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

public class Word
{
  int Vowels;
  String Char;
  int Num;
  



public Word(String w) {
	Char = w;
	

}



public int getLength() {
	Num = 0;
	for(int i = 0; i< Char.length(); i++){
		 
		if(Char.charAt(i) != ' ')    
              Num++;    
      }    
	return Num;
}
public int getNumVowels() {
	 Vowels = 0;
	for (int i = 0; i < Char.length(); i++)
     {
         if (Char.charAt(i) == 'a' || Char.charAt(i) == 'e' || Char.charAt(i) == 'i'
                 || Char.charAt(i) == 'o' || Char.charAt(i) == 'u')
         {
             Vowels++;
         }
     }
     
	
	return Vowels;
}

public String getName() {
	return Char;
}
	
public void setWord(String l) {
	Char = l;
}
	
}