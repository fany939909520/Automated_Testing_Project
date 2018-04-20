package Wrapper_Act_Test;
import wrapper_act.ExercisePart2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class ExercisePart1Test {
     @DataProvider
     public Object[][] data(){
    	 Object[][] obj= {
    			 {22D, 56D, 34D, 98D, 34D, 26.4},
    			 {5D, 5D, 5D, 5D, 20D, 4D},
    			 {2D, 4D, 8D, 14D, 4.6}
    	 };
    	 return obj;
     }
     
     @Test(dataProvider = "data")
     public void FiveNumbersForTestingTest(Double sum, Double AVG, Double ...sample) {
    	 ExercisePart2 E= new ExercisePart2();
    	 Double[] actual = E.FiveNumbersForTesting(sample);
    	 assertThat(sum, equalTo(actual[0]));
    	 assertThat(AVG, equalTo(actual[1]));
    	
     }

}
