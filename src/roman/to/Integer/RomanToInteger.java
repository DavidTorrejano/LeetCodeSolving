package roman.to.Integer;

import java.util.ArrayList;
import java.util.HashMap;

public class RomanToInteger {

    private final ValidRomanNumber validRomanNumber = new ValidRomanNumber();

    private final HashMap <Character, Integer> romanNumbersEquivalences = validRomanNumber.getNUMS();

    public int romanToInteger(String s){
        int cont = 0;
        int valor = 0;
        ArrayList <Character> romaNum = validRomanNumber.verifyRomanNumber(s);

        for(int i=0; i<romaNum.size(); i++){

            char char1= romaNum.get(cont);
            char char2 = ' ';
            if (romaNum.size()> cont+1) {
                char2 = romaNum.get(cont + 1);
            }
            int a = romanNumbersEquivalences.get(romaNum.get(cont));
            int b = 0;
            if (romaNum.size()> cont+1) {
                b = romanNumbersEquivalences.get(romaNum.get(cont + 1));
            }
            if (char1 == 'V' || char1 == 'L' || char1 == 'D'){
                if (char2 == 'X' || char2 == 'C' || char2 == 'M'){
                    valor= -1;

                    return valor;
                }
            }

            if (a>=b){
                valor+= a;
                cont+= 1;
            } else {
                valor+= (b-a);
                cont+= 2;
            }
            if (cont>= romaNum.size()) return valor;

        }
        return valor;
    }
}
