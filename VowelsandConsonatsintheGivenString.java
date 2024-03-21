package String_programs;

import java.util.Arrays;

public class VowelsandConsonatsintheGivenString {
	public static void main(String[] args) {
		String str="hii I am a developer";
		
//		String[] st=str.split(" ");
//		System.out.println(Arrays.toString(st));
		
//		char ch[]=str.toCharArray();
//		
//		System.out.println(Arrays.toString(ch));
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ') {
				
			}
			else {
						if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' )
						{
							System.out.println("vowel: "+str.charAt(i));
						}
						else
						{
							System.out.println("consonats: "+str.charAt(i));
						}
			}
		}
	}

}
