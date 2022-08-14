package Mock;
public class reverse {
	public void reverse()
	{
		String s1 = "shivay";
		int i = s1.length()-1;
		String rev = "";
		for(int j = 0; j<=i;i--)
		{
			 rev  = rev + s1.charAt(i);
		}
		System.out.println(rev);
	}
	public static void prime()
	{
		int num = 8;
		int temp = 0;
		for(int i = 2 ; i<=num-1;i++)
		{
			if (num%i==0)
			{
				temp = temp+1;
				System.out.println(i);
			}
		}
		if(temp>0)
		{
			System.out.println("its not prime");
		}
		else
		{
			System.out.println("its  prime");
		}
	}
	public static void main(String[] args) {
		prime();
	}

}
