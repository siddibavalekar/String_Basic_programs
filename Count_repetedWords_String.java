package String_programs;

import java.util.TreeMap;

public class Count_repetedWords_String {
	
		public static void main(String[] args) {
			String str= "My name is siddhi and My skill is coding";
			char []result=str.toCharArray();
			char b[]=str.toCharArray();

			TreeMap ref=new TreeMap();

			for(int i=0;i<result.length;i++)
			{
				int count=0;
				for(int j=0;j<b.length;j++)
				{
					if(result[i]==(b[j]))
					{
						count++;
					}
		       }
				ref.put(result[i], count);	
		   }
			System.out.println(ref);
			
				
		}
	}



