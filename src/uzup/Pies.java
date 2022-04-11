package uzup;

import java.util.Scanner;

public class Pies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String wynik = reverse(word);
        System.out.println(wynik);



    }
    public static String reverse(String word){
        char[] newWord = new char[word.length()];


        for(int i = 0;i<word.length() ;i++){
            newWord[i]=word.charAt(word.length()-i - 1);
        }
        return new String(newWord);

    }
}

