package practise;
import java.util.HashMap;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
public class DublicateCahractor {
	public static void main(String[] args) {
		String str = "aabbc112444deff";
		char [] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(ch.length);
		HashMap <Character , Integer> hm = new HashMap<Character , Integer>();
		int [] ar = {10,20,30,2,1};
		ar = ArrayUtils.remove(ar, 2);
		
		for(char c : ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		Set<Character> se = hm.keySet();
		for(char c1 :se)
		{
		
			if(hm.get(c1)>1)
			{
				System.out.println(c1 +"    " +hm.get(c1));
			}
		}
	}
}
