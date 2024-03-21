package String_programs;

import java.util.Arrays;

public class ConvertToStringArray {
	public static void main(String[] args) {
		String str="Hello Everyone";
		String[] s=str.split("\\s");
		System.out.println(Arrays.toString(s));
	}

}
