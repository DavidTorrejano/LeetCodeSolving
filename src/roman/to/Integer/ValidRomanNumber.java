package roman.to.Integer;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidRomanNumber {
    private final HashMap<Character, Integer> NUMS = new HashMap<Character, Integer>();

    public ValidRomanNumber(){
        assignEquivalence();
    }

//    GETTER OF THE HASH MAP

    public HashMap<Character, Integer> getNUMS() {
        return NUMS;
    }

//    Adding the roman numbers to the HashMap with their equivalences

    private void assignEquivalence(){
        NUMS.put('I', 1);
        NUMS.put('V', 5);
        NUMS.put('X', 10);
        NUMS.put('L', 50);
        NUMS.put('C', 100);
        NUMS.put('D', 500);
        NUMS.put('M', 1000);
    }

/**
 * With this method we do some verification:
 * @param s this receives a string of characters,
 * In the first if inside the "for" we verify if a character is repeated more than
 * three times, for everytime it repeats add 1 to the variable "cont",
 * the value is verified at the end, in the last "if".
 * the nested "if" verifies if a character such as V, L or D
 * is before any other character greater than them, if that happens
 * the program will return nothing.
 * @return ArrayList
 * */
    public ArrayList<Character> verifyRomanNumber(String s){
        ArrayList <Character> letters = new ArrayList<>();
        int cont = 0;

        for (int i=0; i<s.length(); i++){
            boolean isRoman = NUMS.containsKey(s.charAt(i));

            if (i<s.length()-1) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                cont = a==b ? cont + 1 : 0;

                if (a== 'V' || a== 'L' || a== 'D') cont = a == b? 5 : 0;
            }

            if (isRoman && cont<3) {
                letters.add(s.charAt(i));
            }
            else{
                letters.clear();
                return letters;
            }
        }
        return letters;
    }
}
