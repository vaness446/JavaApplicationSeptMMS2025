
package chapter14;

import java.util.Scanner;
public class MetricConversions {
    
public class Ex1423 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many [unit] are in [value] [unit]? ");
        String question = input.nextLine().toLowerCase();
        // Simple conversion table for common length, mass and volume units.
        String[] units = {
            "meter", "meters", "centimeter", "centimeters",
            "kilometer", "kilometers", "inch", "inches",
            "foot", "feet", "yard", "yards", "mile", "miles",
            "liter", "liters", "quart", "quarts",
            "gram", "grams", "kilogram", "kilograms", "pound", "pounds"
        };
        boolean recognized = false;
        for (String unit : units)
            if (question.contains(unit))
                recognized = true;
        if (!recognized) {
            System.out.println("Invalid or unsupported unit.");
            return;
        }
        System.out.println(
            "For the complete exercise, add a conversion table for " +
            "the units your program supports and reject conversions " +
            "between incompatible dimensions such as feet and kilograms.");
    }
}
}
