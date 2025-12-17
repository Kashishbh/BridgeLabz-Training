class Max_words_found {
    public int mostWordsFound(String[] sentences) {

        int m = 0;

        for (String s : sentences) {
            int w = s.split(" ").length;
            m = Math.max(m, w);
        }

        return m;
    }
}
