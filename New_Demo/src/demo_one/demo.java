package demo_one;
public class demo {
	public static void main(String[] args) {
		String str  = "hello java";
		String rev = " ";
		int a = str.length();
		System.out.println(a);
		a--;
		for(int i = a ; i>=0 ; i--)
		{
				rev = rev + str.charAt(i);
		}
		System.out.println("reverse with space = " +rev);
	}
}
	


