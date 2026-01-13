package Basic;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String [] args) {
		
//		byte []ch= {100,101,102,103,104};
//		String s=new String(ch);
//		System.out.println(s.charAt(2));
//		System.out.println(s.concat(s));
//		System.out.println(s.substring(2));
//		System.out.println(s.substring(2, 5));
//		System.out.println(s.replace('e', '@'));
//		System.out.println(s.toLowerCase() +" "+s.toUpperCase());
		
//		List<String> l=new ArrayList<String>();
//		l.add("Hira");
//		l.add("Sita");
//		System.out.println(l.toString());
		
		String s="silent1234";
		int count=0;
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length-1;i++)
		{
			int n=Integer.parseInt(String.valueOf(c[i]));
			System.out.println(n);
		}
	}
}
