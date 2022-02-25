package week1.day1.classroom;

public class SumOfDigits {

	public class SumofDigits {

	public static void main(String[] args) {
		int num = 123;
		int sum=0;
		for(int i=0;i<num;) {
			int rem = num%10;
			System.out.println("Reminder = "+rem);
			sum = sum+rem;
			System.out.println("sum ="+sum);
			num = num/10;
			
		}
		
		System.out.println("Total sum="+ sum);
		
	}
}
