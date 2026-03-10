import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Function to build character pattern map
    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return map;
    }

    // Function to render banner for a given word
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {
        int rows = 7;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }
}