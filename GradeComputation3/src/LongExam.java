class LongExam {

    private int longexam;

    // LONG EXAM
    public void setLongexam(int newLongexam) {
        longexam = newLongexam;
    }

    public int getLongexam() {
        return longexam;
    }

    // Method to calculate average
    public double calculateLongExam() {
        int totalScore = longexam;
        double averageScore = (double) totalScore / 100;
        double finalScore = averageScore * 100 * 0.3;
        return finalScore;   
       
    }
}
