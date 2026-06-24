import java.util.Scanner;

public class IT26100107Lab9Q4 {

    public static double calcFinalMark(int assignmentMark, int examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char calcGrade(double finalMark) {

        if (finalMark >= 75)
            return 'A';
        else if (finalMark >= 60)
            return 'B';
        else if (finalMark >= 50)
            return 'C';
        else
            return 'F';
    }

    public static void printDetails(String[] names, double[] finalMarks, char[] grades) {

        System.out.println("\nName\tFinal Mark\tGrade");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s\t%.2f\t\t%c\n",names[i], finalMarks[i], grades[i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        double highestMark = -1;
        String highestName = "";
        char highestGrade = ' ';

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ":");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ":");
            int assignment = input.nextInt();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ":");
            int exam = input.nextInt();
            System.out.println();
            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = calcGrade(finalMarks[i]);

            if (finalMarks[i] > highestMark) {
                highestMark = finalMarks[i];
                highestName = names[i];
                highestGrade = grades[i];
            }
        }

        printDetails(names, finalMarks, grades);
    }
}