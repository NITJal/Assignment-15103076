/**
*@Author : GAURAV
*/

package gaurav_3076;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class CountFrequencyOfWords
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the line whose Words Are to be calculated : ");
		String line = new Scanner(System.in).nextLine();
		//making an array of words from the given line
		String[] words = line.split(" ");
		TreeMap< String , Integer > Map = new TreeMap< String , Integer >();
		//calculating the occurence of each words in words Array
		for(int i=0 ; i < words.length ; i++ )
		{
			if( Map.get(words[i]) == null)
				Map.put( words[i], 1);
			else
				Map.put( words[i] , Map.get( words[i] ) + 1 );
		}
		Comparator <String> compare_ = new Comparator<String> ()
		{
				public int compare(String first , String second ) 
				{
						if( Map.get(first) > Map.get(second) )
							return -1;
						else
							return 1;
				}
		};
		TreeMap < String , Integer > NewMap = new TreeMap < String , Integer >(compare_);
		NewMap.putAll(Map);
		//displaying all the words in TreeMap along with their frequencies of occurences
		for(String word : NewMap.keySet())
			System.out.println(word + "  =  " + Map.get(word) );
	}

}