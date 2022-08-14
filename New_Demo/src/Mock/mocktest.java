package Mock;
//Reverse the String but location not change
public class mocktest {
	public static void main(String[] args) {
		String s1 = "ashish is automation engineer";
		String rev = "";
		System.out.println("Main String   = " +s1);
		int i = s1.length();
		i--;
		for(int j = 0;j<=i; i--)
		{
			rev = rev + s1.charAt(i);	
		}
		String r1 = "" ,r2 = "" ,r3 = "" ,r4 = "";
		for(int j1 = 23 ;j1<=28;j1++)
		{
			r1 = r1+ Character.toString(rev.charAt(j1));
		}
		for(int j1 = 20 ;j1<=21;j1++)
		{
			r2 = r2+ Character.toString(rev.charAt(j1));
		}
		for(int j1 = 9 ;j1<=18;j1++)
		{
			r3 = r3+ Character.toString(rev.charAt(j1));
		}
		for(int j1 = 0 ;j1<=7;j1++)
		{
			r4 = r4+ Character.toString(rev.charAt(j1));
		}
		System.out.println("Rever String  = " + r1 + " " +r2 +" "+r3 +" " +r4);
	}
}
