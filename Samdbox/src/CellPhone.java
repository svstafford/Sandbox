
public class CellPhone extends HomePhone{
	public void sound() {
		super.sound();
		System.out.print("Beep ");
	}
	
	public void vibrate() {
		super.vibrate();
		System.out.print("Bzzt ");
	}
}
