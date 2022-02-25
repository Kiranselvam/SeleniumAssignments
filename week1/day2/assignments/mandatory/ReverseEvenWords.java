package week1.day2.assignments.mandatory;

public class ReverseEvenWords {
	
public static String reverseString(String s){
	char c[]=s.toCharArray();
String reverse="";
	for(int i=c.length-1;i>=0;i--){
reverse+=c[i];
}
return reverse;
}
 
public static void main(String[] args) {
System.out.println(reverseString("Hi All"));
System.out.println(reverseString("Welcome to Edureka Blog"));
}
}
