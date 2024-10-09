package com.dest.quizapp;
import java.util.*;

public class Quiz {
    static int score = 0;
    static boolean used5050 = false;  // Track 50-50 usage
    static boolean usedPeoplePoll = false;  // Track People Poll usage
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t----------Welcome To Quiz Game----------");
        System.out.println("\t\t\tPress 1 to Start the Game");
        System.out.println("\t\t\tPress 2 to Exit the Game");
        
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                startGame();
                break;
            case 2:
                exitGame();
                break;
            default:
                System.out.println("Invalid input. Exiting...");
                exitGame();
                break;
        }
    }

    private static void exitGame() {
        System.out.println("Final Score is: " + score);
        System.out.println("Thank you for playing!");
        System.out.println("---------------------------------------------------");
        System.exit(0);
    }

    private static void startGame() {
        System.out.println("==============================================================");
        System.out.println("\t\t\tStarting....");
        System.out.println("Select the subject:");
        String[] subjects = {"1. English", "2. Maths", "3. General Knowledge"};
        for (String subject : subjects) {
            System.out.println(subject);
        }
        
        Scanner sc = new Scanner(System.in);
        int subjectChoice = sc.nextInt();
        System.out.println("==============================================================");
        switch (subjectChoice) {
            case 1:
                englishQuiz();
                break;
            case 2:
                mathsQuiz();
                break;
            case 3:
                generalQuiz();
                break;
            default:
                System.out.println("Invalid subject choice. Exiting...");
                exitGame();
        }
    }

    private static void generalQuiz() {
        System.out.println("\t\t\tWelcome to General Knowledge Quiz");
        System.out.println();
        String[] questions = {
            "1. Who is the President of the United States?",
            "2. What is the capital of Japan?",
            "3. In which year did World War II end?"
        };
        String[] options = {
            "1. Joe Biden \n2. Donald Trump \n3. Barack Obama",
            "1. Tokyo \n2. Beijing \n3. Seoul",
            "1. 1940 \n2. 1945 \n3. 1950"
        };
        int[] answers = {1, 1, 2}; // Correct answers
        
        quiz(questions, options, answers);
    }

    private static void quiz(String[] questions, String[] options, int[] answers) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println();
            System.out.println(options[i]);
            System.out.println();
            System.out.println("Lifelines available: ");
            if (!used5050) {
                System.out.println("1. 50-50");
            }
            if (!usedPeoplePoll) {
                System.out.println("2. People Poll");
            }
            System.out.println("Enter 0 if you do not want to use a lifeline.");
            
            int lifelineChoice = sc.nextInt();
            if (lifelineChoice == 1 && !used5050) {
                use5050(i, options, answers);
                used5050 = true;
            } else if (lifelineChoice == 2 && !usedPeoplePoll) {
                usePeoplePoll(i, options, answers);
                usedPeoplePoll = true;
            }
            
            System.out.println("Select Your Answer: ");
            int userAnswer = sc.nextInt();
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer. The correct answer was: " + answers[i]);
                exitGame();
            }
            System.out.println("---------------------------------------------------");
        }
        
        // At the end of the quiz, show final score
        exitGame();
    }

    // 50-50 Lifeline: Remove two wrong options and keep one correct option and one wrong option
    private static void use5050(int questionIndex, String[] options, int[] answers) {
        Random random = new Random();
        List<Integer> wrongOptions = new ArrayList<>();
        
        // Find wrong options
        for (int i = 1; i <= 3; i++) {
            if (i != answers[questionIndex]) {
                wrongOptions.add(i);
            }
        }
        
        // Randomly keep one wrong option and remove the others
        Collections.shuffle(wrongOptions);
        int correctOption = answers[questionIndex];
        int wrongOptionToKeep = wrongOptions.get(0);

        // Display the two remaining options (one correct and one wrong)
        String[] optionLines = options[questionIndex].split("\n");
        System.out.println("50-50 Lifeline used! Remaining options:");
        System.out.println(optionLines[correctOption - 1]);  // Correct option
        System.out.println(optionLines[wrongOptionToKeep - 1]);  // One wrong option
    }

    // People Poll Lifeline: Simulate a poll, biased toward the correct answer
    private static void usePeoplePoll(int questionIndex, String[] options, int[] answers) {
        Random random = new Random();
        int correctOption = answers[questionIndex];
        
        // Generate random percentages, favoring the correct answer
        int correctPercentage = random.nextInt(30) + 50;  // 50-80% for correct answer
        int remainingPercentage = 100 - correctPercentage;
        
        int wrong1Percentage = random.nextInt(remainingPercentage);
        int wrong2Percentage = remainingPercentage - wrong1Percentage;
        
        // Display poll results, giving higher weight to the correct answer
        String[] optionLines = options[questionIndex].split("\n");
        System.out.println("People Poll Results:");
        for (int i = 1; i <= 3; i++) {
            if (i == correctOption) {
                System.out.println(optionLines[i - 1] + ": " + correctPercentage + "%");
            } else if (wrong1Percentage > 0) {
                System.out.println(optionLines[i - 1] + ": " + wrong1Percentage + "%");
                wrong1Percentage = 0;  // Use up this percentage
            } else {
                System.out.println(optionLines[i - 1] + ": " + wrong2Percentage + "%");
            }
        }
    }

    private static void mathsQuiz() {
        System.out.println("Welcome to Maths Quiz");
        String[] questions = {
            "1. What is 5 + 3?",
            "2. What is 12 * 2?",
            "3. What is 15 / 3?"
        };
        String[] options = {
            "1. 6 \n2. 7 \n3. 8",
            "1. 24 \n2. 22 \n3. 20",
            "1. 5 \n2. 4 \n3. 3"
        };
        int[] answers = {3, 1, 1}; // Correct answers

        quiz(questions, options, answers);
    }

    private static void englishQuiz() {
        System.out.println("Welcome to English Quiz");
        String[] questions = {
            "1. Which of the following is a noun?",
            "2. What is the synonym of 'happy'?",
            "3. Which of the following is a verb?"
        };
        String[] options = {
            "1. Quickly \n2. Cat \n3. Red",
            "1. Sad \n2. Joyful \n3. Angry",
            "1. Run \n2. Table \n3. Beautiful"
        };
        int[] answers = {2, 2, 1}; // Correct answers

        quiz(questions, options, answers);
    }
}
