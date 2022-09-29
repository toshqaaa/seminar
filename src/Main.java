

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Problem problem = new Problem();
        System.out.println(problem.isPalindrom(problem.str));
    }
}

class Problem {
    public String str;

    Problem() {
        Scanner in = new Scanner(System.in);
        str = in.next();
        in.close();
    }

    public boolean isPalindrom(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (j > i) {
            if (chars[i] != chars[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

}
