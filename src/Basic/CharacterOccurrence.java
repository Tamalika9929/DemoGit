package Basic;

import java.util.HashMap;

public class CharacterOccurrence  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String j="Tamalika";
		char a[]=j.toCharArray();
		
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		int count=1;
		
		for(int i=0;i<a.length;i++) {
			if(!obj.containsKey(a[i])) {
				obj.put(a[i], count);
			}
			else {
				obj.put(a[i], obj.get(a[i])+1);
			}
		}
		
		for(char c:obj.keySet()) {
			System.out.println(c+" :" +obj.get(c));
		
		}
	}
}
	
