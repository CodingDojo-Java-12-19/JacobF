public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
       String newStr1 = str1.trim();
       String newStr2 = str2.trim();
       String resultStr = newStr1.concat(newStr2);
       return resultStr;
    }
    public Integer getIndexOrNull(String str, char letter) {
        Integer result = str.indexOf(letter);
        if (result == -1) {
            return result = null;
        } else {
            return result;
        }
    }
    public Integer getIndexOrNull(String str, String inStr) {
        Integer result = str.indexOf(inStr);
        if (result == -1) {
            return result = null;
        } else {
            return result;
        }
    }
    public String concatSubstring(String str1, int start, int end, String str2) {
        String newStr = str1.substring(start, end);
        String resultStr = newStr.concat(str2);
        return resultStr;
    }
}