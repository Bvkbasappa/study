package study;

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");

	String sound;

	Animals(String s) {
		sound = s;
		// TODO Auto-generated constructor stub
	}
}

public class TestEnum {
	static Animals a;

	public static void main(String[] args) {
		System.out.println(Animals.DOG.sound + " " + Animals.FISH.sound);

	}

}