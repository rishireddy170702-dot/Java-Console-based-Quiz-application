package com.gqt.corejavaproject;
import javax.swing.JOptionPane;

public class AppLauncher2 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"--- WELCOME TO THE JAVA QUIZ CHALLENGE ---");

        String playerName = JOptionPane.showInputDialog(null, "Enter your name:");

        int currentLevel = 1;
        int temp = 0;
        boolean fiftyFiftyUsed = false;
        boolean audiencePollUsed = false;

        int prizeMoney[] = {1000, 2000, 5000, 10000, 20000, 40000, 80000, 160000, 320000, 1000000};

        String[][] questions = {
                {"Which keyword is used to create a class in Java?", "class", "Class", "struct", "void", "1"},
                {"Which data type is used to store text?", "int", "String", "float", "char", "2"},
                {"What is the default value of an int variable?", "0", "1", "null", "undefined", "1"},
                {"Which operator is used for equality comparison?", "=", "==", "===", "equals", "2"},
                {"Which loop is guaranteed to execute at least once?", "for", "while", "do-while", "foreach", "3"},
                {"Which method is the entry point of a Java program?", "start()", "init()", "run()", "main()", "4"},
                {"Which keyword is used to inherit a class?", "extends", "implements", "inherits", "using", "1"},
                {"How do you find the length of a string 'str'?", "str.size()", "str.length", "str.length()", "len(str)", "3"},
                {"Which package is imported by default in Java?", "java.util", "java.io", "java.lang", "java.net", "3"},
                {"Which keyword is used for constant variables?", "const", "final", "static", "immutable", "2"}
        };

        while (currentLevel <= 10) {

            String[] q = questions[currentLevel - 1];

            String msg = "Question : " + currentLevel + "\n\n"
                    + currentLevel + ". " + q[0] + "\n\n"
                    + "1. " + q[1] + "    2. " + q[2] + "\n"
                    + "3. " + q[3] + "    4. " + q[4] + "\n\n"
                    + "5. Use Lifeline";

            int choice = Integer.parseInt(
                    JOptionPane.showInputDialog(null, msg));

            if (choice == 5) {

                if (currentLevel == 10) {
                    JOptionPane.showMessageDialog(null,
                            "Lifelines are not allowed for the final question!");
                } 
                else if (fiftyFiftyUsed && audiencePollUsed) {
                    JOptionPane.showMessageDialog(null,
                            "No lifelines available, please select the correct option.");
                } 
                else {

                    String lifeMsg = "Available Lifelines:";
                    if (!fiftyFiftyUsed)
                        lifeMsg += "\n1. 50-50";
                    if (!audiencePollUsed)
                        lifeMsg += "\n2. Audience Poll";

                    char lifeChoice = JOptionPane.showInputDialog(null, lifeMsg).charAt(0);

                    if (lifeChoice == '1' && currentLevel != 10 && !fiftyFiftyUsed) {

                        JOptionPane.showMessageDialog(null,
                                "[50-50 Used]\nCorrect option is either "
                                        + q[Integer.parseInt(q[5])] + " or one other.");

                        fiftyFiftyUsed = true;

                    } 
                    else if (lifeChoice == '2' && currentLevel < 10 && !audiencePollUsed) {

                        JOptionPane.showMessageDialog(null,
                                "[Audience Poll]\nOption " + q[5]
                                        + ": 70%\nOthers: 10% each.");

                        audiencePollUsed = true;

                    } 
                    else {
                        JOptionPane.showMessageDialog(null,
                                "Lifeline already used or invalid selection!");
                    }
                }

                choice = Integer.parseInt(
                        JOptionPane.showInputDialog(null,
                                "Now enter your final answer (1-4):"));
            }

            if (choice == Integer.parseInt(q[5])) {

                temp = temp + prizeMoney[currentLevel - 1];

                JOptionPane.showMessageDialog(null,
                        "Correct Answer! " + playerName
                                + "!\nYou won ₹" + prizeMoney[currentLevel - 1]
                                + "\nUpto now you won ₹" + temp);

                currentLevel++;

            } 
            else {

                JOptionPane.showMessageDialog(null,
                        "Wrong Answer! " + playerName
                                + "\nGame Over.\nYou go home with ₹" + temp);
                break;
            }
        }

        if (currentLevel > 10) {
            JOptionPane.showMessageDialog(null,
                    "Congratulations " + playerName
                            + "!\nYou Won the Quiz\n\nAMAZING!\nYou have Won ₹" + temp);
        }
    }
}