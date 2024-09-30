package Sept._20092024;

import java.sql.SQLOutput;

public class Task2 {
    public static void main(String[] args) {
        //Ternary Operators to handle multiple conditions.
        // Input → int score = 85
        // String grade →
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C
        int score=85;
        String Grade = score>=90? "A":(score>=80? "B" :(score>=70? "C" :"D"));
        System.out.println("your Grade is " + Grade);
        //Output: your Grade is B

    }
}
