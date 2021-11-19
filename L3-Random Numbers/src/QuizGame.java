import java.util.Random;

public class QuizGame {
    static int userAnswer, correctAnswer;
    static String displayProblem = "";
    public static void main(String[] args) {
        
    }
    public static void addProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1+num2;
        displayProblem = num1 + " + " + num2;
    }
    public static void subtProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1-num2;
        displayProblem = num1 + " - " + num2;
    }
    public static void multProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1*num2;
        displayProblem = num1 + " * " + num2;
    }
    public static void divideProblem(){
        int num1 = randomNum();
        int num2 = randomNum();

        correctAnswer = num1/num2;
        displayProblem = num1 + " / " + num2;
    }

    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

}

