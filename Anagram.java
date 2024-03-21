package String_programs;

import java.util.Arrays;

public class Anagram {
	
		public static void main(String[] args) {
			String a="Listen";
			String b="Silent";
			
			String a1=a.toLowerCase();
			
			String b1=b.toLowerCase();
			
			char ch1[]=a1.toCharArray();
			System.out.println(Arrays.toString(ch1));
			char ch2[]=b1.toCharArray();
			System.out.println(Arrays.toString(ch2));
			
			Arrays.sort(ch1);
			System.out.println(Arrays.toString(ch1));
			Arrays.sort(ch2);
			System.out.println(Arrays.toString(ch2));
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
			
			
		}

	}



