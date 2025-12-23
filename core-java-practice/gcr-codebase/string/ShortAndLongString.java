public class ShortAndLongString {
    static int findLength(String str) {
        int i= 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {}
        return i;
    }
    static int[] findShortLong(String[][] table) {
        int min= Integer.parseInt(table[0][1]);
        int max= min;

        for (int i= 1; i < table.length; i++) {
            int len= Integer.parseInt(table[i][1]);
            if (len< min) min= len;
            if (len> max) max= len;
        }
        return new int[]{min,max};
    }
}
