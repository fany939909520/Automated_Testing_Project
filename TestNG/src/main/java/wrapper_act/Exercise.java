package wrapper_act;

public class Exercise {
     public String compareMarks(Long Maths, Double English) {
    	 Integer math= Maths.intValue();
    	 Integer english =English.intValue();
    	 String display="";
    	 
    	 if(english > math) {
    		 display="English mark is higher than Maths";
    	 }else if(english < math) {
    		 display = "Maths mark is higher than English";
    	 }else if(english == math) {
    		 display = "Both are equal";
    	 }
    	 return display;
     }
}
