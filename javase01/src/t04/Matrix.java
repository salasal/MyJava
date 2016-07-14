package t04;

/**
 * Created by Alexey on 20.06.2016.
 */
public class Matrix {
    public static void main(String[] args) {
        //  int max_x = 7;
        // int max_y = 6;
        char matrix[] [] = new char [6] [7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if((i == j)&& (i != 3) && (j != 3))
                    matrix[i][j] = '1';
                else if ((i != j)&& (i != 3) && (j != 3))
                    matrix [i][j] = '0';
                else if ((i == 3) && (i !=j))
                    matrix [i][j] = 'M';
                else if ((j == 3) && (i !=j))
                    matrix [i][j] = 'Л';
                else matrix [i][j] = 'О';
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
