package week3.day2;

public class Automation extends MultipleLangauge{

	public static void main(String[] args) {
		Automation at = new Automation();
		at.ruby();
		at.Java();
		at.Selenium();
		at.python();

	}

	public void Selenium() {
		System.out.println("This is calling Selenium method of Test Tool Interface in Automation Class ");
		
	}

	public void Java() {
		System.out.println("This is calling Java  method of Language Interface in Automation Class ");
		
	}

	
	public void ruby() {
		System.out.println("This is calling Ruby method of MultipleLanguages in Autoamtion Class ");
		
	}

}
