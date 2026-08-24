
package chapter14;

import java.util.Scanner;
public class WordEquivalentofaCheckAmount {
    
public class Ex1421 {
    static String[] ones = {
        "", "ONE", "TWO", "THREE", "FOUR", "FIVE",
        "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
        "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
        "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN",
        "NINETEEN"
    };
    static String[] tens = {
        "", "", "TWENTY", "THIRTY", "FORTY", "FIFTY",
        "SIXTY", "SEVENTY", "EIGHTY", "NINETY"
    };
    static String words(int n) {
        if (n < 20) return ones[n];
        if (n < 100)
            return tens[n / 10] +
                (n % 10 == 0 ? "" : " " + ones[n % 10]);
        return ones[n / 100] + " HUNDRED" +
            (n % 100 == 0 ? "" : " " + words(n % 100));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount less than $1000: ");
        double amount = input.nextDouble();
        int dollars = (int) amount;
        int cents = (int)Math.round((amount - dollars) * 100);
        System.out.println(
            words(dollars) + " AND " +
            String.format("%02d", cents) + "/100");
    }
}
}
