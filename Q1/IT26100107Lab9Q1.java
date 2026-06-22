import java.util.Scanner;

public class IT26100107Lab9Q1{
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		double a ;
		double b ;
		double c ;
        double Root1 ;
		double Root2 ;
		double discriminant ;
		
		System.out.print("Enter value a: ");
		a = input.nextDouble();
		System.out.print("Enter value b: ");
		b = input.nextDouble();
		System.out.print("Enter value c: ");
		c = input.nextDouble();

        discriminant = Math.pow(b, 2) - (4*a*c);
		
		if (discriminant > 0){ 
		    Root1 = (-b + Math.sqrt(discriminant)) / (2*a);
		    Root2 = (-b - Math.sqrt(discriminant)) / (2*a);
            System.out.println("Roots are real and different : ");
            System.out.printf("Root 1 : %.2f%n",Root1);
		    System.out.printf("Root 2 : %.2f%n",Root2);
		}else if (discriminant == 0){
			Root1 = -b / (2*a);
			System.out.println("\nRoots are real and Equal : ");
			System.out.printf("Root : %2f%n",Root1);
		}else {
			System.out.println("\nNo real Roots ");
		}
	}
}