package coms.loops;
import java.util.*;
public class loopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();

		
		
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int x=1;x<=i;x++) {
				
			if(i%x==0)
			{	
				count++;	
			}
			}
			if(count == 2) {
				System.out.print(i+" ");
			}
			
		}
			
			sc.close();
		}
		

	}

