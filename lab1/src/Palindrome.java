public class Palindrome {

    static boolean isPalindrome(String str)
    {

        //Указатели, указывающие на начало
        // и конец строки
        int i = 0, j = str.length() - 1;

        // Пока есть символы для сравнения
        while (i < j) {

            // если есть несоответствие
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        String str = "шалаш";

        if (isPalindrome(str))
            System.out.print("Да");
        else
            System.out.print("Нет");
    }
}
