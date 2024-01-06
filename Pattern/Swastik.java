package Pattern;

public class Swastik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++) {
			for(int j=0;j<11;j++) {
				if(j==11/2 || i==11/2 ||(i==0 && j>11/2) || (i==10 && j<11/2) || (j==0 && i<11/2) ||(j==10 && i>11/2)){
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
