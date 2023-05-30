package roman.to.Integer;


public class Main {
    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanos = "CXX";

        int number = romanToInteger.romanToInteger(romanos.toUpperCase().trim());

        if (number== -1){
            System.out.println("No se permite usar V, L o D para restarse a otro número");
        }else {
            System.out.println("De romanos " + romanos + " a enteros es: " + number);
        }

    }
}
