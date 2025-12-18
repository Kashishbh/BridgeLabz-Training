public class Fee_discount {
    public static void main(String[] args) {
        int fee = 125000;
        int dis_Percent = 10;

        int dis = (fee * dis_Percent) / 100;
        int final_fee = fee - dis;

        System.out.println("The discount amount is INR " + dis +
                " and final discounted fee is INR " + final_fee);
    }
}
