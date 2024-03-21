package String_programs;

import java.util.TreeMap;

public class Calculate_Repeated_String {
	public static void main(String[] args) {
		String str= "My name is siddhi and My skill is coding";
		String []result=str.split(" ");
		String b[]=str.split(" ");

		TreeMap ref=new TreeMap();

		for(int i=0;i<result.length;i++)
		{
			int count=0;
			for(int j=0;j<b.length;j++)
			{
				if(result[i].equals(b[j]))
				{
					count++;
				}
	       }
			ref.put(result[i], count);	
	   }
		System.out.println(ref);
	}
}