import java.util.*;

public class Online_Quiz_platform {

    public static int calculateScore(String[] correctAnswers, String[] userAnswers) {
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
        return score;
    }   

    public static String getGrade(int score, int totalQuestions) {
        double percentage = (score * 100.0) / totalQuestions;
        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else return "D";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] correctAnswers = {"A", "C", "B", "D", "A"};
        int totalQuestions = correctAnswers.length;
        List<Integer> userScores = new ArrayList<>();

        System.out.print("Enter number of users: ");
        int userCount = sc.nextInt();
        sc.nextLine();

        for (int u = 1; u <= userCount; u++) {
            System.out.println("\nUser " + u + " - Enter your answers (space separated):");
            String[] userAnswers = sc.nextLine().trim().split(" ");

            int score = calculateScore(correctAnswers, userAnswers);
            userScores.add(score);

            String grade = getGrade(score, totalQuestions);
            System.out.println("User " + u + " Score: " + score + "/" + totalQuestions);
            System.out.println("Grade: " + grade);
        }

        System.out.println("\nAll User Scores: " + userScores);
        sc.close();
    }
}
