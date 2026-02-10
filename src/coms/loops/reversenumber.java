package coms.loops;
import java.util.*;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int rev = 0, r = 0;
		int m = n;
		for(;n>0;n/=10)
		{
			r = n%10;
			rev = rev*10+r;
		}
		
		if(m == rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
