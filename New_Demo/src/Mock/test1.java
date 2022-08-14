package Mock;



public  class test1
{
	public void abc() throws Exception
	{
		int age = 1;
		if(age < 18)
		{  
			// throw an object of user defined exception  
			throw new Exception("age is not valid to vote");    
		}  
		else {   
			System.out.println("welcome to vote");   
		}   
	}
	public static void main(String[] args)
	{
		// method to check the age  



	}


}