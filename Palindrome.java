package week1.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=101,rev=0,rem;
int original=num;
while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;
}
if(original==rev) {
	System.out.println("Number entered is a palindrome number");
}
else
{
	System.out.println("Number entered is not a palindrome");
}


	}

}
