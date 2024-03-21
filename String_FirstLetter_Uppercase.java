package String_programs;

import java.util.Arrays;
import java.util.TreeSet;

public class String_FirstLetter_Uppercase {
public static void main(String[] args) {
		
		String arr[]= {"ritika","neha","siddhi","sakshi","pranali"};
		System.out.println(Arrays.toString(arr));
		String str[]=new String[arr.length];

		for(int i=0;i<arr.length;i++) {
			String first = arr[i].substring(0, 1).toUpperCase();
			String remaining = arr[i].substring(1, arr[i].length());
			String newString = first+remaining;
			str[i]=newString;
		}

		System.out.println(Arrays.toString(str));
		
		TreeSet<String> ref= new TreeSet();
		for(String n : str) {
			ref.add(n);
		}
		System.out.println(ref);
		
		
	}
}


