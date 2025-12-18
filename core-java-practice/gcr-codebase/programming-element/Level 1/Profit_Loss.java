class Profit_Loss{
    public static void main(String[] args) {
        double CP=129;
        double SP=191;
        double profit= SP-CP;
        double profit_percent=(profit/CP)*100;
        double loss=CP-SP;
        double loss_percent=(loss/CP)*100;
        System.out.println("The Cost Price is INR " + CP + " and Selling Price is INR " + SP +"\n" + "The profit is INR " + profit + "and The Profit Percent is " + profit_percent + "\n" + "The Loss is INR " + loss + "and The Loss Percent is " + loss_percent );
       
    }
}