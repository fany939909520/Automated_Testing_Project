package BeginingTestNG.FirstTestNGLesson;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(Slow.class)
public class FinishJunitPart2 {
	@Test
	public void testOne() {
		System.out.println("Test partOne");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test partTwo");
	}
}
