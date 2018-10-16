
public class StringManipulator 
{
	//fields
	
	//constructors
	
	//methods
	public String noVowels (String a)
	{
		String str = "";
		for (int i = 0; i< a.length(); ++i)
		{
			if (a.charAt(i) == 'a' || a.charAt(i) == 'i' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
			{
				str = str + "*";
			} 
			else {str = str + "" + a.charAt(i);}
			
		}
		return str;
	}
	public String reverse (String a)
	{
		String str = "";
		for (int i = 0; i< a.length(); ++i)
		{
			str = str + "" + a.charAt((a.length()-1) - i);
		}
		return str;
	}
}
