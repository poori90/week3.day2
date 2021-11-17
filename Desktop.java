package week3.day2;

public class Desktop implements HardWare , Software {

	public static void main(String[] args) {
		Desktop dp = new Desktop();
		dp.softwareResources();
		dp.hardwareResources();
		dp.desktopModel();

	}

	public void softwareResources() {
		
		System.out.println("This method is calling Software Resources ");
	}

	public void hardwareResources() {
		System.out.println("This method is calling Hardware Resources ");
		
		
	}
	public void desktopModel()
	{
		System.out.println("This method is calling Desktop Model ");
	}

}
