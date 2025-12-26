class RemoveDuplicate{
    static String removeDup(String s) {
        String result ="";
        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == -1)
                result+= s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeDup("kashish"));
    }
}