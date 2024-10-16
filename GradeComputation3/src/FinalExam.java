class FinalExam {

    private int finalexam;

    // FINAL EXAM
    public void setFinalexam(int newFinalexam) {
        finalexam = newFinalexam;
    }

    public int getFinalexam() {
        return finalexam;
    }

    // Method to calculate average
    public double calculateFinalExam() {
        int totalScore = finalexam;
        double averageScore = (double) totalScore / 100;
        double finalScore = averageScore * 100 * 0.1;
        return finalScore;
       
    }
}
