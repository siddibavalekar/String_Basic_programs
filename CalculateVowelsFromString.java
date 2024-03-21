package String_programs;

public class CalculateVowelsFromString {
	public static void main(String[] args) {
		
	
	String str="siddhi bavalekar";
	char c[]=str.toCharArray();
	int result=0;
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o'|| str.charAt(i)=='u')
		{
			result++;
		}
	}
	System.out.println("Vowels:"+ result);
		
		
		
	}
	
	

}
