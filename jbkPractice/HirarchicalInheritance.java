package jbkPractice;
class Father1{
	public void father() {
		System.out.println("This is Father property");
	}
}
class Brother extends Father1{
	public void brother() {
		System.out.println("This is Father property given to borther");
	}
}
class Sister extends Father1{
	public void sister() {
		System.out.println("This is Father property given to sister");
	}
}

public class HirarchicalInheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father1 f=new Father1();
		Brother b=new Brother();
		Sister s=new Sister();
		f.father();
		b.brother();
		b.father();
		s.sister();
		s.father();
	}

}
