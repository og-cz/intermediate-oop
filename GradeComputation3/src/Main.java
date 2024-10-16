import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AssessmentTask at = new AssessmentTask();

        try {
            System.out.print("Quiz 1 (50): ");
            int quiz1 = scanner.nextInt();
            if (quiz1 > 50) {
                System.out.println("Quiz score cannot exceed 50.");
                return;
            }
            at.setQuiz1(quiz1);

            System.out.print("Activity 1 (50): ");
            int activity1 = scanner.nextInt();
            if (activity1 > 50) {
                System.out.println("Activity score cannot exceed 50.");
                return;
            }
            at.setActivity1(activity1);

            System.out.print("Lab Act 1 (50): ");
            int labact1 = scanner.nextInt();
            if (labact1 > 50) {
                System.out.println("Lab Act score cannot exceed 50.");
                return;
            }
            at.setLabact1(labact1);

            System.out.print("Quiz 2 (50): ");
            int quiz2 = scanner.nextInt();
            if (quiz2 > 50) {
                System.out.println("Quiz score cannot exceed 50.");
                return;
            }
            at.setQuiz2(quiz2);

            System.out.print("Activity 2 (50): ");
            int activity2 = scanner.nextInt();
            if (activity2 > 50) {
                System.out.println("Activity score cannot exceed 50.");
                return;
            }
            at.setActivity2(activity2);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        LongExam le = new LongExam();

        try {
            System.out.print("Long Exam (100): ");
            int longexam = scanner.nextInt();
            if (longexam > 100) {
                System.out.println("Long Exam cannot exceed 100.");
                return;
            }
            le.setLongexam(longexam);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        GroupExam ge = new GroupExam();

        try {
            System.out.print("Group Exam (100): ");
            int groupexam = scanner.nextInt();
            if (groupexam > 100) {
                System.out.println("Group Exam cannot exceed 100.");
                return;
            }
            ge.setGroupexam(groupexam);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        FinalExam fe = new FinalExam();

        try {
            System.out.print("Final Exam (100): ");
            int finalexam = scanner.nextInt();
            if (finalexam > 100) {
                System.out.println("Final Exam cannot exceed 100.");
                return;
            }
            fe.setFinalexam(finalexam);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        double assessmentTaskGrade = at.calculateAssessmentTask();
        System.out.println("Asessment Task Grade: " + assessmentTaskGrade);

        double longExamGrade = le.calculateLongExam();
        System.out.println("Long Exam Grade: " + longExamGrade);

        double groupExamGrade = ge.calculateGroupExam();
        System.out.println("Group Exam Grade: " + groupExamGrade);

        double finalExamGrade = fe.calculateFinalExam();
        System.out.println("Final Exam Grade: " + finalExamGrade);

        double finalGrade = calculateFinalGrade(assessmentTaskGrade, longExamGrade, groupExamGrade, finalExamGrade);

        System.out.println("-------------------------");
        System.out.println("FINAL GRADE: " + finalGrade);
        System.out.println("-------------------------");

    }

    // Method to sum up final grades
    public static double calculateFinalGrade(double assessmentTaskGrade, double longExamGrade, double groupExamGrade, double finalExamGrade) {
        return assessmentTaskGrade + longExamGrade + groupExamGrade + finalExamGrade;
    }
}
