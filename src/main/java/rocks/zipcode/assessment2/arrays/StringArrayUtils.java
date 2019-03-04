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
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        return null;
    }
}
