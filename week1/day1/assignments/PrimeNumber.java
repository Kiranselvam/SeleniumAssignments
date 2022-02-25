package week1.day1assignment;


public class PrimeNumber {
	
	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
		float num2= num/2f;
		
		for (int i=2; i<= num2;i++)
		{	
			if(num%i==0)
			
				flag=true;
		}
				
	if (flag==true)
		System.out.println("Not Prime Number");
	else 
		System.out.println("Prime Number");
				
				
	}

}
