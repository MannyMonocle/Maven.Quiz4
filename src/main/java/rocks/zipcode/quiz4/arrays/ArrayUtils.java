package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer middleIndex = values.length/2;
        return values[middleIndex];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] ans = new String[values.length - 1];
        Integer middleIndex = values.length/2;
        Integer w = 0;

        for(int i = 0; i < values.length; i++){
            if(i != middleIndex){
                ans[w] = values[i];
                w++;
            }
        }

        return ans; }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] ans = new String[values.length - 1];
        for(int i = 0; i < values.length - 1; i++){
            ans[i] = values[i];
        }
        return ans;
    }
}