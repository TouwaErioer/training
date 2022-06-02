package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * @Author TouwaErioer
 * @Data 2022/3/8 16:35
 **/
public class No1309 {
    public String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int again = Character.getNumericValue(s.charAt(i));
                int letter = s.charAt(i) + s.charAt(i + 1);
                stringBuilder.append((char) (letter + 9 * again));
                i = i + 2;
            } else {
                char letter = s.charAt(i);
                stringBuilder.append((char) ((int) letter + 48));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No1309().freqAlphabets("1326#"));
    }
}
