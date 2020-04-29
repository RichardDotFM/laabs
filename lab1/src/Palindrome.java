public class Palindrome {

    public static void main(String[] args) {
        for (int j = 0; j < args.length; j++) {
            String s = args[j];
            System.out.println("Слово " + s + " палиндром? " + isPalindrome(s));
        }
    }
    public static boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        for (int j = 0; j < str.length/2; j++) {
            if (str[j] != str[str.length - 1 - j]) {
                return false;
            }
        }
        return true;

    }

}
