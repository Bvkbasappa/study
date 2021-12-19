package study;

class Rocket {int id;
String name;
int id2;
}

public class Shuttle extends Rocket {
	public static void main(String args[]) {
		new Shuttle().go();
	}

	void go() {
		blastOff();
		//Rocket.blastOff();// line A

	}

	private void blastOff() {
		System.out.println("sh-bang");
	}
}
