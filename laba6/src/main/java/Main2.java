import java.util.Random;

public class Main2 {
    public static void main(String[] args){
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i< SIZE; i++) {
             for (int j = 0; j< SIZE; j++) {
                colors[i][j] = random.nextInt(256);
                }
        }
        for (int i = 0; i< SIZE; i++) {
             for (int j = 0; j< SIZE; j++) {
                 System.out.format("%4d", colors[i][j]);
             }
            System.out.println();
        }
        int[][] rotatedColors = new int[SIZE][SIZE];

    }
}
