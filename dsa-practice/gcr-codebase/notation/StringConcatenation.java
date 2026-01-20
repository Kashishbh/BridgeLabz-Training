public class StringConcatenation {
    public static void main(String[] args) {
        int n = 10000;
        // Using String (O(N²))
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "A";
        }
        // Using StringBuilder (O(N))
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("A");
        }

        // Using StringBuffer (O(N))
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("A");
        }
        System.out.println("Concatenation Done");
    }
}


