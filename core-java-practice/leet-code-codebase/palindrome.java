class Palindrome {
    public boolean is_Palindrome(int a) {
        if (a < 0 || (a % 10 == 0 && a != 0)) {
            return false;
        }

        int rev = 0;
        while (a > rev) {
            rev = rev * 10 + a % 10;
            a /= 10;
        }
      return a == rev || a == rev / 10;
    }
}