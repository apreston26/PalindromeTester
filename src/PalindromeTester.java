public class PalindromeTester {

    public static void main(String[] args) {
        String myWord = "apple";
        System.out.println(recursion(myWord));
    }



    public static boolean recursion(String input) {
        boolean isPalindrome = false;
        if (input.length() <= 1 || (input.charAt(0) == input.charAt(input.length() - 1) && recursion(input.substring(1, input.length() - 1)))) {
            isPalindrome = true;
        }

        return isPalindrome;
    }

}
