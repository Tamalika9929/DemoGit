package Basic;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="silent1234";
		int count=0;
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length-1;i++)
		{
			int n=Integer.parseInt(String.valueOf(c[i]));
			System.out.println(n);
			
			System.out.print("Hi guys");;
		}
		
		System.out.print("Hello , How are you?");

	}

}
