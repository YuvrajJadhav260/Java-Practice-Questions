package Array;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {17,33,22,11};
		int evensum=0,oddsum=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0) {
				evensum+=n[i];
			}else {
				oddsum+=n[i];
			}
		}
		System.out.println(evensum);
		System.out.println(oddsum);

	}

}
