package Pattern;

public class practiceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(i+j==2 || j-i==2 || i==2 && j==2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
