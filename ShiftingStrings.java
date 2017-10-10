/**
*@Author : GAURAV
*/

package gaurav_3076;

import java.util.*;

public class ShiftingStrings
{
    static void StringsOnShifts(String inputString)
    {
        String patternString = "";
        int N=inputString.length();
        //making the pattern string by concatinating the string Twice
        patternString=patternString+inputString+inputString;
        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N+i;j++)
                System.out.print(patternString.charAt(j));
            System.out.print("\n");
        }
    }
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		System.out.println("The Strings after left-Shifts Are : ");
		StringsOnShifts(str);
	}
}