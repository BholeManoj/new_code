package demo_one;
//Java program to convert a ArrayList to
//an array using add() in a loop.
import java.util.*;
class arraylisttoarray
{
	public static void main (String[] args)
	{
		String[] geeks = {"Rahul", "Utkarsh",
						"Shubham", "Neelam"};
		List<String> al = new ArrayList<String>(geeks.length);
		List<String> a2 = Arrays.asList(geeks);
		System.out.println(a2);
	}
}

