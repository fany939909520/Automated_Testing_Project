package wrapper_act;

public class ExercisePart2 {
    public Double[] FiveNumbersForTesting(Double ...numbers) {
    	Double sum=0.0;
    	Double avg;
    	for(Double s: numbers){
    		sum+=s;
    		
    	}
    	
    	avg = sum/numbers.length;
		Double[] results = {sum, avg};
		return results;
    }
}
