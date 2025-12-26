class SubstringCount{
    static int countOccurrences(String s, String sub) {
        int count= 0;
        for (int i= 0; i<= s.length()- sub.length();i++) {
            if (s.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countOccurrences("abababa", "aba"));
    }
}