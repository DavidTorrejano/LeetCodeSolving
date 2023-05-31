package roman.to.Integer;


public class Main {
    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();

        String romanos = "XVIII";

        int number = romanToInteger.romanToInteger(romanos.toUpperCase().trim());

        if (number== 0){
            System.out.println("El número dado tiene algo incorrecto.");
        }else {
            System.out.println("De romanos " + romanos + " a enteros es: " + number);
        }

    }
}
