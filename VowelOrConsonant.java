import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single letter");
        char letter = scanner.next().charAt(0);
        scanner.close();

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;

        }
        if (isVowel) {
            System.out.println("The letter is vowel");
        } else {
            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
                System.out.println("The letter is consonant");
            } else {
                System.out.println("The input is not an alphabet");
            }
        }


    }
}
