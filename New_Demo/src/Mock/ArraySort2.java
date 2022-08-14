package Mock;
import java.util.ArrayList;
public class ArraySort2 {
	public static void main(String[] args) {
		int a [] = new int [5];
		a  [0] = 1;a  [1] = 0;a  [2] = 6;a  [3] = 0;a  [4] = 2;
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		for(int i = 0;i<a.length;i++)
		{
				if(a[i]==0)
			{
				arrli.add(i);
				continue;
			}
			System.out.println(a[i]);
		}
		for(int j = 0;j<arrli.size();j++)
		{
			System.out.println(a[arrli.get(a[j])]);
		}}}
