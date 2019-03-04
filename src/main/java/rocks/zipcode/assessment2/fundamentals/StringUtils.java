package rocks.zipcode.assessment2.fundamentals;

import java.util.stream.Stream;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    // TODO Ask about String format
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%"+amountOfPadding+"s",stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-"+amountOfPadding+"s",stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String temp = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            temp += stringToBeRepeated;
        }
        return temp;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        String whithSpaces = string.replaceAll(" ","");
        Character[] temp = new Character[whithSpaces.length()];
        Boolean result = true;
        for (int i = 0; i < temp.length; i++) {
            if( !Character.isAlphabetic(whithSpaces.charAt(i)) ){
                result = false;
            }
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String whithSpaces = string.replaceAll(" ","");
        Character[] temp = new Character[whithSpaces.length()];
        Boolean result = true;
        for (int i = 0; i < temp.length; i++) {
            if( !Character.isDigit(whithSpaces.charAt(i)) ){
                result = false;
            }
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    // TODO Revisar
    public static Boolean isSpecialCharacterString(String string) {
        Boolean result = false;
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        for (int i = 0; i < string.length(); i++) {
            if (specialChars.contains(string.substring(i, 1))) {
                return true;
            }
            else {
                return false;
            }
        }
        return result;
    }
}
