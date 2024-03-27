import java.util.Scanner;

public class Password_Checker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your password: ");
        String password = sc.nextLine();

        int score = calculateStrength(password);

        System.out.println("\nPassword strength score: "+score);
        System.out.println("Feedback: "+getFeedback(score));
        System.out.println();
        
        sc.close();
    }
    
    public static int calculateStrength(String password) {
        int score=0;

        //length check
        if (password.length() >= 8) {
            score++;
        }

        if (Character.isUpperCase(password.charAt(0))) {
            score++;
        }

        //lowercase letters
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        //uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        //numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        //special characters
        if (password.matches(".*[!@#$%^&*()-+=?<>].*")) {
            score++;
        }

        return score;
    }

    public static String getFeedback(int score) {
        if (score >= 5) {
            return "Strong Password";
        } else if (score >= 3) {
            return "Medium Password";
        } else {
            return "Weak Password";
        }
    }
}
