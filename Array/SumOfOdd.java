package Array;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int rollno[]= {50,30,40,51,61,71};
		for(int i=0;i<rollno.length;i++) {
			if(rollno[i]%2==1) {
				sum=sum+rollno[i];
			}
		}
		System.out.println(sum);
		
	}

}
