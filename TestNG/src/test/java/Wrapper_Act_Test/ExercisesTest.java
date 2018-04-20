package Wrapper_Act_Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import wrapper_act.Exercise;

public class ExercisesTest {
     @DataProvider
     public Object[][] data(){
    	 Object[][] obj= {
    		 {85D, 65L, "English mark is higher than Maths"}, 
    		 {56D, 98L, "Maths mark is higher than English"},
    		 {84D, 84L, "Both are equal"}};
    	 
    	  return obj;
     };
     
   @Test(dataProvider = "data")
   public void testMethod(Double English, Long Math, String expected) {
	   Exercise E = new Exercise();
	   String actual =E.compareMarks(Math, English);
	   assertThat(expected, equalTo(actual));
   }
}
