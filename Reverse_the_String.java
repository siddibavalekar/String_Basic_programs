package String_programs;

public class Reverse_the_String {
	public static void main(String[] args) {
		String str="I am a programmer";
		String rev=" ";
		String ss[]=str.split("");
		
		for(String s:ss)
		{
			rev=s+rev;
		}
		System.out.println(rev);
		
	}

}
