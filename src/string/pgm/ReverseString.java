package string.pgm;

public class ReverseString {
public static void main(String[] args) {
	System.out.println(reverse("github learning"));
}
public static String reverse(String str)
{
	String out="";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		out=ch[i]+out;
	}
	return out;
}
}
