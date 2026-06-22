public class IT26100107Lab9Q3 {
	public static int add(int num1,int num2){
		return num1 + num2;
	}
	
	public static int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	public static int square(int num) {
		return num * num ;
	}
	
	public static void main(String[]args){
		int term1 = multiply(3,4);
		int term2 = multiply(5,7);
		int innerSum1 = add(term1, term2);
		int result1 = square(innerSum1);
		
		int innerSum2 = add(4,7);
		int squareTerm1 = square(innerSum2);
		int innerSum3 = add (8,3);
		int squareTerm2 = square(innerSum3);
		int result2 = add(squareTerm1, squareTerm2);
		
		System.out.println("Result of (3*4+5*7)^2        : "+ result1);
		System.out.println("Result of (4+7)^2 + (8+3)^2  : "+ result2);
	}
}