import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int len = s.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        for (int j = 0; j < len; j++) {
            int currentVal = getValue(arr[j]);
            int prevVal = j > 0 ? getValue(arr[j - 1]) : 0;

            if (j > 0 && currentVal > prevVal) {
                result = result - 2 * prevVal; // Subtract twice the value of the previous character
            }

            result = result + currentVal;
        }
        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman numeral: ");
        String a = scanner.nextLine();
        Solution solution = new Solution();
        int b = solution.romanToInt(a);
        System.out.println(b);
    }
}
