package demo_one;

public class mock {

	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;
			int c  =  a/b;
		    System.out.println(c);
		} 
		catch (Exception e) //executed when try catch 
		{
		    System.out.println(e);
		} finally //every time executed
		{
		    System.out.println("In finally");
		}

	}

}
