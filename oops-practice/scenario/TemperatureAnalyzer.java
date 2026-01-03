public class TemperatureAnalyzer {
    public static void analyzeTemperature(float[][] temp) {
        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;
        for (int day = 0; day < 7; day++) {
            float sum = 0;
            for (int hour = 0; hour < 24; hour++) {
                sum += temp[day][hour];
            }
            float avg = sum / 24;
            System.out.println("Average temperature of Day " + (day + 1) + ": " + avg);
            if (avg > hottestAvg) {
                hottestAvg = avg;
                hottestDay = day + 1;
            }
            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = day + 1;
            }
        }

        System.out.println("Hottest Day: Day " + hottestDay);
        System.out.println("Coldest Day: Day " + coldestDay);
    }

    public static void main(String[] args) {

        float[][] temperatures = new float[7][24];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 24; j++) {
                temperatures[i][j] = 20 + (float)(Math.random() * 15);
            }
        }

        analyzeTemperature(temperatures);
    }
}
