package testgen;

public class Test {
	public static void one ()
	{
		char i;
		System.out.printf("The Alphabets from A to Z are: \n");
		for(int a = 1 ; a<=10;a++)
		{
			for (i = 'A'; i <= 'Z'; i++)
			{
			System.out.println(" " +i +" = "+a);
			}
		}
	}
	public void two ()
	{
	
	}
//vish yog = 
	public static void main(String[] args) {
		one ();
		startup obj = new startup();
		//invoke the browser
//		obj.invoke_driver("https://demoqa.com/text-box");
//		//id xpath text
//		String name = obj.id("userName-label");
//		System.out.println(name);

	}

}
