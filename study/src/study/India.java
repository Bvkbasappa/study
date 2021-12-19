package study;

public class India {

	public static long count(String s, char ch)
	{
		return s.chars()
				.filter(c -> c==ch)
				.count();
	}
	public static void main(String a[])
	{
		String str="INDIA";
		char c1='I';
		System.out.println(count(str, c1));
	}
}


