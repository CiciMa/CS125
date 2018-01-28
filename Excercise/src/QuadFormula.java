
public class QuadFormula {
	public static void main(String[] args){
	
		// 
	
	double a = 2.0;
	double b = 2.0;
	double c = 1.0;
	
	double firstSolution = quadFormula(a, b, c , true);
	double secondSolution = quadFormula(a, b, c , false);
	}
	
	public static double quadFormula(double aa, double bb, double cc , boolean firstSolution){
		double solution = 0.0;
		
		if(firstSolution){
			solution = (-bb + Math.sqrt(bb*bb - 4.0* aa* cc))/ (2.0* aa);
		}else{
			solution = (-bb - Math.sqrt(bb*bb - 4.0* aa* cc))/ (2.0* aa);
		}
		return solution;
	}

}
