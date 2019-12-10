package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Integer middleIndex = string.length()/2;
        return string.charAt(middleIndex);
    }

    public static String capitalizeMiddleCharacter(String str) {
        Integer middleIndex = str.length()/2;
        return str.substring(0,middleIndex) + Character.toUpperCase(str.charAt(middleIndex)) + str.substring(middleIndex + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Integer middleIndex = str.length()/2;
        return str.substring(0,middleIndex) + Character.toLowerCase(str.charAt(middleIndex)) + str.substring(middleIndex + 1);
    }

    public static Boolean isIsogram(String str) {
        for(int i = 1; i < str.length(); i++){
            char c = str.charAt(i);
            if(str.indexOf(c) != i){ return false;}
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){return true; }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String ans = "";
        ans = (str.charAt(0) == str.charAt(1)) ? ans : ans + str.charAt(0);
        for(int i = 1; i < str.length() -1; i++){
            ans = (str.charAt(i) != str.charAt(i-1) && str.charAt(i) != str.charAt(i+1)) ? ans + str.charAt(i) : ans;
        }
        ans = (str.charAt(str.length()-1) == str.charAt(str.length()-2)) ? ans : ans + str.charAt(str.length()-1);
        return ans;
    }

    public static String invertCasing(String str) {
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            Character c = str.charAt(i);
            c = (Character.isLowerCase(c)) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            ans += c;
        }
        return ans;
    }
}