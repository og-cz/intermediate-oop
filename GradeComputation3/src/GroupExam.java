class GroupExam {

    private int groupexam;

    // GROUP EXAM
    public void setGroupexam(int newGroupexam) {
        groupexam = newGroupexam;
    }

    public int getGroupexam() {
        return groupexam;
    }

    // Method to calculate average
    public double calculateGroupExam() {
        int totalScore = groupexam;
        double averageScore = (double) totalScore / 100;
        double finalScore = averageScore * 100 * 0.3;
        return finalScore;
       
    }
}
