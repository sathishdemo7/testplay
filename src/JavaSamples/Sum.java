package JavaSamples;

public class Sum {
public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<10;i++) {
		if(i%2==0) {
			sum=sum+1;
		}
	}
	System.out.println(sum);
}
}
