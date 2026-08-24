
package chapter14;


public class OwnVersionsofindexOfandlastIndexOf {
    public class Ex1416 {
    static int myIndexOf(String text, char target) {
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == target)
                return i;
        return -1;
    }
    static int myLastIndexOf(String text, char target) {
        for (int i = text.length() - 1; i >= 0; i--)
            if (text.charAt(i) == target)
                return i;
        return -1;
    }
    public static void main(String[] args) {
        String text = "programming";
        System.out.println(myIndexOf(text, 'g'));
        System.out.println(myLastIndexOf(text, 'g'));
    }
}
}
