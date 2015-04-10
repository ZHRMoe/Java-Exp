/**
 * Created by ZHR-rMBP on 15/3/17.
 */

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = input.nextLine();
        System.out.println("共有" + count(str) + "个字符");
    }

    public static int count(String str) {
        int letterCount = 0;
        int numCount = 0;
        int spaceCount = 0;
        int otherCount = 0;
        char[] singleLetter = str.toCharArray();
        for (int i = 0; i < str.length(); ++i) {
            if (singleLetter[i] >= 'a' && singleLetter[i] <= 'z' || singleLetter[i] >= 'A' && singleLetter[i] <= 'Z') {
                letterCount++;
            }
            else if (singleLetter[i] >= '0' && singleLetter[i] <= '9') {
                numCount++;
            }
            else if (singleLetter[i] == ' ') {
                spaceCount++;
            }
            else {
                otherCount++;
            }
        }
        int sum = letterCount + numCount + spaceCount + otherCount;
        System.out.println("有" + letterCount + "个字母");
        System.out.println("有" + numCount + "个数字");
        System.out.println("有" + spaceCount + "个空格");
        System.out.println("有" + otherCount + "个其他字符");
        return sum;
    }
}
