public class Troll {
    public static String disemvowel(String str) {
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'a' || chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o' || chr[i] == 'u') {
                chr[i] = '0';
            } else if (chr[i] == 'A' || chr[i] == 'E' || chr[i] == 'I' || chr[i] == 'O' || chr[i] == 'U') {
                chr[i] = '0';
            }
        }
        String intStr = String.valueOf(chr);
        String outStr = intStr.replace("0", "");
        return outStr;
    }
}
