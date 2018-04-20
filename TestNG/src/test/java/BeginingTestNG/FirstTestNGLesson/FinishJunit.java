package BeginingTestNG.FirstTestNGLesson;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FinishJunit {
    
	@Category(Fast.class)
	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	@Category(Slow.class)
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}
}
