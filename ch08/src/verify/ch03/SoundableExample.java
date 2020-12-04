package verify.ch03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		Soundable soundable = new Cat();
		printSound(soundable);
		printSound(new Dog());

	}
}
