package tests;

public class TasksWithStrings {
    public static void main(String[] args) {
        String firstTask = "Hello";
        System.out.println("1) New replace string is: \n" + reverseString(firstTask) + "\n");

        String secondTask = "Finally print count";
        System.out.println("2) Number of vowels in this string is " + countVowelsInText(secondTask) + "\n");

        String thirdTask = "if the input string is";
        System.out.println("3) The string without white spaces:\n" + removeWhiteSpaces(thirdTask));

        String fourthTaskNumOne = "Was it a car or a cat I saw";
        System.out.println("4) Check for Palindrome "+fourthTaskNumOne+" \n"+checkForPalindrome(fourthTaskNumOne) + "\n");

        String fifthTask = "Won’t lovers revolt now";
        System.out.println("5) Convert String \""+fifthTask+" to Uppercase:\n"+convertStringToUppercase(fifthTask)+"\n");

        String sixthTask = "Was it a car or a cat I saw";

        System.out.println("6) The substring of the original string:\n"+ extractASubstring(sixthTask)+"\n");

        String seventhTaskNumOne = "In the above program,";
        String seventhTaskNumTwo = "we have used the split() method";
        System.out.println("7) The resulf of cancatination first string: \"" +
                seventhTaskNumOne + "\" and the second string: \"" + seventhTaskNumTwo +
                " is:\n" + concatenateTwoStrings(seventhTaskNumOne, seventhTaskNumTwo));
    }

    public static String reverseString(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result = string.charAt(i) + result;
        }
        return result;
    }

    public static int countVowelsInText(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;
            }

        }
        return count;
    }

    public static String removeWhiteSpaces(String string) {
        return string = string.replace(" ", "");
    }

    public static String checkForPalindrome(String string) {
        String newString = string.toLowerCase().replace(" ", "");
        String reversString = reverseString(string).toLowerCase().replace(" ", "");
        String answer;
        if (newString.equals(reversString)) {
            answer = "String is palindrome";
        } else {
            answer = "String isn't palindrome";
        }
        return answer;
    }

    public static String convertStringToUppercase(String string) {
        return string.toUpperCase();
    }

    public static String extractASubstring(String string) {
        return string.substring(2);
    }

    public static String concatenateTwoStrings(String firstString, String secondString) {
        return firstString + secondString;
    }
}

