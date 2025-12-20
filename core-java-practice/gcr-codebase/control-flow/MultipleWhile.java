import java.util.Scanner;
class MultipleWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int count= 100;
        if (num>0 && num<100) {
            while (count>= 1) {
                if (count%num==0)
                    System.out.println(count);
                count--;
            }
        }
    }
}
