package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    // TODO Revisar
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if (endingIndex-startingIndex >= 0) {
            System.out.println("Entro");
            String[] temp = new String[endingIndex - startingIndex];
            Integer c = 0;
            for (int i = startingIndex; i < endingIndex; i++) {
            System.out.println("1. " + c);
                temp[c++] = arrayToBeSpliced[i];
            }
            System.out.println("yy");
            System.out.println(Arrays.asList(temp) );
            return temp;

        }
        System.out.println("xxxx");
        return arrayToBeSpliced;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    // TODO Revisar
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

//        System.out.println(Arrays.asList(arrayToBeSpliced));
//        System.out.println(arrayToBeSpliced.length);
//        System.out.println(startingIndex);
            if (arrayToBeSpliced.length > startingIndex) {
//            System.out.println("Dentro del 1-if");
                String[] temp = new String[arrayToBeSpliced.length - startingIndex];
//            System.out.println("OO"+ Arrays.asList(temp));
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = arrayToBeSpliced[i + startingIndex];
                }
//            System.out.println("Fuera del for: " + Arrays.asList(temp));
                return temp;
            }
//        System.out.println("Antes dle end");
        String[] expected = {};
//        System.out.println("End");
        return (new String[] {});
    }
}
