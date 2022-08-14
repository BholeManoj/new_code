package Mock;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class maxArray {
	public void max()
	{
		int [] arr = {1, 45, 67, 98, 455,    678};
		int max=Integer.MIN_VALUE; 
		for ( int element : arr){
		if(element>max){ max=element;
		}}
		System.out.println(max);	
	}
	public void reverse()
	{
		int [] Array ={7,8,9,3,4,6,11,67,98};
		int k=Array.length-1; 
		for(k=Array.length-1;k>=0;k--)
		{
		System.out.print( Array[k] + " ");
		}

	}
	public static void dubcharremove()
	{
		String str = "accelationisthebest";
		char [] ch = str.toCharArray();
		ArrayList<Character> numbers = new ArrayList<Character>(); 
		for(char c : ch)
		{
			numbers.add(c);
		}
		//	sort a to z in that manner
		Collections.sort(numbers);
		//remove duplicate in array
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>(numbers);
		System.out.println(linkedHashSet);
	}
	public static void  removesplchar()
	{
	String Str = "Y^%^*%&*^*25984(&*(Pankaj";
		Str= Str.replaceAll("[^a-z,0-9, A-Z]", "");
		System.out.println(Str);

	}
	public void ss() throws Exception
	{
		WebDriver driver = null;
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f1 = new File("");
		FileHandler.copy(f, f1);
	}
	public static void main(String[] args) {
		maxArray obj = new maxArray();
		dubcharremove();
		removesplchar();
		obj.max();
		int [] arr = { 1,21,3,2};
		int min = Integer.MAX_VALUE;
		for ( int element : arr)
		{if(element<min)
			{ 
				min=element;
			}}
		System.out.println(min);
	}}


