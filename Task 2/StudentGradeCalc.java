import java.util.Scanner;
public class StudentGradeCalc{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of subjects");
        int numSub = sc.nextInt();

        double[] marks = new double[numSub];
        double totalMarks=0;

        for (int i=0; i<numSub; i++){
            marks[i] = sc.nextDouble();
            totalMarks += marks[i];
        }

        double averagePer = totalMarks/numSub;

        String grade;
        if(averagePer>=90){
            grade="A+";
        } else if(averagePer>=80){
            grade="A";
        } else if(averagePer>=70){
            grade="B";
        } else if(averagePer>=60){
            grade="C";
        } else if(averagePer>=50){
            grade="D";
        } else{
            grade="F";
        }
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks:"+ totalMarks);
        System.out.println("Average Percentage:"+ averagePer);
        System.out.println("Grade: "+ grade);

    }
}
