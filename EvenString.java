package String_programs;

public class EvenString {
	public static void main(String[] args) {
		String str="I am developer";
		System.out.println(str);
		for(String st:str.split(" "))
		{
			if(str.length()%2==0)
			{
				System.out.println(st);
			}
		}
	}

}
