
import java.util.Scanner;
public class MultiDimensionalArrays{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row= scan.nextInt();
        int col= scan.nextInt();
        int[][] matrix= new int[row][col];
        int[] array= new int[row* col];
        int index= 0;
        for (int i= 0; i< row; i++)
            for (int j= 0; j< col; j++)
                matrix[i][j]= scan.nextInt();
        for (int i= 0; i< row; i++)
            for (int j= 0; j< col; j++)
                array[index++]= matrix[i][j];
        for (int val : array)
            System.out.print(val+" ");
    }
}
