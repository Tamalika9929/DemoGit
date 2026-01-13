package Basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number->");
		int temp=1;
		int num=sc.nextInt();
		if(num<=1)
			temp=0;
		else
			for(int i=2;i<num;i++) {
				if(num%i==0)
					temp=0;
			}
		if(temp==0)
			System.out.println("Not prime");
		else if(temp==1)
			System.out.println("Prime");
	}

}
