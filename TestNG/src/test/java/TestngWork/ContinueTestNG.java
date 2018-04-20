package TestngWork;
import org.testng.annotations.Test;
public class ContinueTestNG {    
	
	
	@Test(groups="special", enabled=false)
    public void oneStepTest() {

        System.out.println("Stepping ONE");

        

    }

    

    @Test(groups="NotSpecial")

    public void secondStepTest() {

        System.out.println("Stepping TWO");

        

    }

    

    @Test
    public void thirdStepTest() {

        System.out.println("Stepping THREE");

        

    }

}

