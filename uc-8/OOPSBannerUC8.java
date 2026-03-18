import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = getPatternMap();

        String message = "OOPS";

        printBanner(message, patternMap);
    }

    // Build Map
    public static Map<Character, String[]> getPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // Print Banner Function
    public static void printBanner(String message, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) { // rows
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) { // each letter
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}