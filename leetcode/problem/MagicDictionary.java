package leetcode.problem;

/**
 * @Description https://leetcode.cn/problems/implement-magic-dictionary/
 * @Author duhongyu
 * @Data 2022/7/11 17:43
 **/
public class MagicDictionary {

    private String[] words;

    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        words = dictionary;
    }

    public boolean search(String searchWord) {
        if (searchWord == null || searchWord.length() == 0) {
            return false;
        }
        for (String word : words) {
            if (word == null || word.length() != searchWord.length()) {
                continue;
            }
            int diff = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != searchWord.charAt(i)) {
                    diff += 1;
                    if (diff > 1) {
                        break;
                    }
                }
            }
            if (diff == 1) {
                return true;
            }
        }
        return false;
    }
}
