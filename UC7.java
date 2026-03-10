public class UC7{
    public static class CharacterPatternMap{
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
        public static String[] getOpattern(){
            return new String[]{
                    "   ***   ",
                    " **   ** ",
                    "**     **",
                    "**     **",
                    "**     **",
                    " **   ** ",
                    "   ***   "
            };

        }
        public static String[] getPpattern(){
            return new String[]{
                    "******   ",
                    "**    ** ",
                    "**     **",
                    "**    ** ",
                    "******   ",
                    "**       ",
                    "**       "
            };
        }
        public static String[] getSpattern(){
            return new String[]{
                    "   ***** ",
                    " **      ",
                    "**       ",
                    "  *****  ",
                    "      ** ",
                    " **   ** ",
                    "  *****  "
            };
        }
    public static void main(String[] args) {
        CharacterPatternMap[] letters = {
                new CharacterPatternMap('O', getOpattern()),
                new CharacterPatternMap('O', getOpattern()),
                new CharacterPatternMap('P', getPpattern()),
                new CharacterPatternMap('S', getSpattern())
        };
        for (int i = 0; i < 7; i++){
            StringBuilder line = new StringBuilder();
            for(CharacterPatternMap letter : letters){
                line.append(letter.getPattern()[i]).append(" ");
            }
            System.out.println(line);
        }
        }
    }
}