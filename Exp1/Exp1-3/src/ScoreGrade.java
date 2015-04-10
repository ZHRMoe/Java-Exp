/**
 * Created by ZHR-rMBP on 15/3/17.
 */

import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        while ((score = input.nextInt()) != -1) {
            if (score >= 90) {
                System.out.println("Grade: A");
            }
            else if (score >= 60) {
                System.out.println("Grade: B");
            }
            else {
                System.out.println("Grade: C");
            }
        }
    }
}
