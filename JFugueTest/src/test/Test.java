package test;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class Test {

	public static void main(String[] args) {

		Pattern pattern = new Pattern();
		Player player = new Player();
		
		pattern.add("C4h*3:2 D4h*3:2 A4h*3:2");
		pattern.add("C4h D4h A4h");
		
//		pattern.add("Cq*7:8 Cq*7:8 Cq*7:8 Cq*7:8 Cq*7:8 Cq*7:8 Cq*7:8");
//		pattern.add("Eq*9:8");
		
		player.play(pattern);
	}

}
