class AssessmentTask {

    private int quiz1;
    private int activity1;
    private int labact1;
    private int quiz2;
    private int activity2;

    // QUIZ 1
    public void setQuiz1(int newQuiz1) {
        quiz1 = newQuiz1;
    }

    public int getQuiz1() {
        return quiz1;
    }

    // ACTIVITY 1
    public void setActivity1(int newActivity1) {
        activity1 = newActivity1;
    }

    public int getActivity1() {
        return activity1;
    }

    // LAB ACT 1
    public void setLabact1(int newLabact1) {
        labact1 = newLabact1;
    }

    public int getLabact1() {
        return labact1;
    }

    // QUIZ 2
    public void setQuiz2(int newQuiz2) {
        quiz2 = newQuiz2;
    }

    public int getQuiz2() {
        return quiz2;
    }

    // ACTIVITY 2
    public void setActivity2(int newActivity2) {
        activity2 = newActivity2;
    }

    public int getActivity2() {
        return activity2;
    }

    // Method to calculate average
    public double calculateAssessmentTask() {
        int totalScore = quiz1 + activity1 + labact1 + quiz2 + activity2;
        double averageScore = (double) totalScore / 250;
        double finalScore = averageScore * 100 * 0.3;
        return finalScore;
    }
}
