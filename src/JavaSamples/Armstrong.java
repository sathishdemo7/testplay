package JavaSamples;

public class Armstrong {
public static void main(String[] args) {
	int num=153;
	int rem=0;
	int rev=0;
	while(num>0) {
		rem=num%10;
		rev=(rem*rem*rem)+rev;
		num=num/10;
	}
	System.out.println(rev);
}
}
