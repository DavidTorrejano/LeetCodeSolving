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

//    This method verify if the typed string contains only roman characters

    public ArrayList<Character> verifyRomanNumber(String s){
        ArrayList <Character> letters = new ArrayList<>();
        int cont = 0;

        for (int i=0; i<s.length(); i++){
            boolean isRoman = NUMS.containsKey(s.charAt(i));

            if (i<s.length()-1) {
                char a = s.charAt(i);
                char b = s.charAt(i + 1);
                cont = a==b ? cont + 1 : 0;

                if (a== 'V' && b== 'V'){
                    letters.clear();
                    return letters;
                } else if (a== 'L' && b== 'L') {
                    letters.clear();
                    return letters;
                } else if (a== 'D' && b== 'D') {
                    letters.clear();
                    return letters;
                }
            }

            if (isRoman && cont<3){
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
