public class OOPSBannerUC7 {

    // Inner Static Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    // Utility methods to create patterns
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });
    }

    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });
    }

    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = getOPattern();
        CharacterPattern p = getPPattern();
        CharacterPattern s = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            line.append(o.getPattern()[i]).append(" ");
            line.append(o.getPattern()[i]).append(" ");
            line.append(p.getPattern()[i]).append(" ");
            line.append(s.getPattern()[i]);

            banner[i] = line.toString();
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}