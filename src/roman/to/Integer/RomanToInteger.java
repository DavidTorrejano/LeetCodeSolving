package roman.to.Integer;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {

    private final ValidRomanNumber validRomanNumber = new ValidRomanNumber();

    private final HashMap <Character, Integer> romanNumbersEquivalences = validRomanNumber.getNUMS();

    /**
     * @param s here we create a counter and the variable we are going to return which is valor
     * @return int, this method is the one we are going to use in the main, hence, here we'll take
     * the input by the user validate if it is a valid roman number, once done, we will iterate
     * over the Array stored in romanNumber comparing two numbers in order to know if it is
     * higher or lower than the other, to operate over themselves and add the correct amount to "valor"*/
    public int romanToInteger(String s){
        int counter = 0;
        int valor = 0;
        ArrayList <Character> romaNum = validRomanNumber.verifyRomanNumber(s);

        for(int i=0; i<romaNum.size(); i++){

            char char1= romaNum.get(counter);
            char char2 = ' ';
            if (romaNum.size()> counter+1) {
                char2 = romaNum.get(counter + 1);
            }
            int a = romanNumbersEquivalences.get(romaNum.get(counter));
            int b = 0;
            if (romaNum.size()> counter+1) {
                b = romanNumbersEquivalences.get(romaNum.get(counter + 1));
            }


            if (a>=b){
                valor+= a;
                counter+= 1;
            } else {
                valor+= (b-a);
                counter+= 2;
            }
            if (counter>= romaNum.size()) return valor;

        }
        return valor;
    }
}
