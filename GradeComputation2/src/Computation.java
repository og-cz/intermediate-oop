public class Computation {
    private int tsk1;
    private int tsk2;
    private int tsk3;
    private int tsk4;
    private int tsk5;
    private int peta1;
    private int peta2;
    private int finals;

    public Computation(int tsk1, int tsk2, int tsk3, int tsk4, int tsk5, int peta1, int peta2, int finals) {
        this.tsk1 = tsk1;
        this.tsk2 = tsk2;
        this.tsk3 = tsk3;
        this.tsk4 = tsk4;
        this.tsk5 = tsk5;
        this.peta1 = peta1;
        this.peta2 = peta2;
        this.finals = finals;
    }

    public int getTsk1() {
        return tsk1;
    }

    public int getTsk2() {
        return tsk2;
    }

    public int getTsk3() {
        return tsk3;
    }

    public int getTsk4() {
        return tsk4;
    }

    public int getTsk5() {
        return tsk5;
    }

    public int getPeta1() {
        return peta1;
    }

    public int getPeta2() {
        return peta2;
    }

    public int getFinals() {
        return finals;
    }

    public void setTsk1(int tsk1) {
        this.tsk1 = tsk1;
    }

    public void setTsk2(int tsk2) {
        this.tsk2 = tsk2;
    }

    public void setTsk3(int tsk3) {
        this.tsk3 = tsk3;
    }

    public void setTsk4(int tsk4) {
        this.tsk4 = tsk4;
    }

    public void setTsk5(int tsk5) {
        this.tsk5 = tsk5;
    }

    public void setPeta1(int peta1) {
        this.peta1 = peta1;
    }

    public void setPeta2(int peta2) {
        this.peta2 = peta2;
    }

    public void setFinals(int finals) {
        this.finals = finals;
    }

    public void displayGrade() {
        double grade = tsk1 + tsk2 + tsk3 + tsk4 + tsk5;
        double percent = grade / 250;
        double mult = percent * 0.3;
        double whole = mult * 100;

        double petaa1 = (double) peta1 / 100;
        double pett1 = petaa1 * 0.2;
        double pettt1 = pett1 * 100;

        double petaa2 = (double) peta2 / 100;
        double pett2 = petaa2 * 0.2;
        double pettt2 = pett2 * 100;

        double finalss = (double) finals / 100;
        double finalss1 = finalss * 0.3;
        double finalss2 = finalss1 * 100;
        
        System.out.println("---------------------------------");
        // Task total
        System.out.println("Task Grade: " + whole);
        // Long Exam
        System.out.println("Long Exam Grade: " + pettt1);
        // Group Exam
        System.out.println("Group Exam Grade: " + pettt2);
        // Final Exam
        System.out.println("Final Exam Grade: " + finalss2);

        // Total grade
       double overalltask = whole + pettt1 + pettt2 + finalss2;
       System.out.println("---------------------------------");
        System.out.println("Total Grade Grade: " + overalltask);
        System.out.println("---------------------------------");

    }
}
