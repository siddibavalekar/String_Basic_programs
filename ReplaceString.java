package String_programs;

public class ReplaceString {
	public static void main(String[] args) {
		String str="I am a divilopir";
		String result=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='i')
			{
			result+='e';
			}
			else
			{
				result+=str.charAt(i);
				
			}
		}
		System.out.println(result);
		
	}

}
