package JavaSamples;

public class CountNUmber {
public static void main(String[] args) {
	int num=1234567;
	int rem=0;
	int rev=0;
	while(num>0) {
		rem=num%10;
		rev=rev+1;
		num=num/10;
	}
	System.out.println(rev);
}
}
