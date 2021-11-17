package week3.day2;

public class College extends University{
	
	public static void main(String[] args) {
		College cl = new College();
		cl.ug();
		cl.pg();

	}
	
	public  void ug() {
		System.out.println("This is UG method from College class ");
		
	}

}
