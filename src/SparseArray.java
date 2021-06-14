import java.util.Arrays;

public class SparseArray {
    public static void main(String[] args) {
        int[][] chess = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;

        for (int[] row: chess){
            for(int data: row){
                System.out.printf("%d\t", data);
            }
            System.out.println("\t");
        }
        int volume = 0;
        for(int i = 0; i< chess[0].length;i++){
            for(int j = 0; j< chess[i].length;j++){
                if(chess[i][j] != 0){
                    volume++;
                }
            }
        }
        System.out.println(volume);
        //Create a sparse array

        int sparseArray[][] = new int[volume+1][3];

        sparseArray[0][0]= chess[0].length;
        sparseArray[0][1] = chess[0].length;
        sparseArray[0][2] = volume;

        int count = 0;
        for(int i = 0; i< 11;i++){
            for(int j = 0; j< 11;j++){

                if(chess[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chess[i][j];
                }
            }
        }
        for(int i=0; i<sparseArray.length;i++){
            for(int j = 0; j<sparseArray[0].length;j++){
                System.out.println(sparseArray[i][j]);
            }
        }


        //Complete conversion from sparse array to normal two-dmension array
        int[][] chessCon = new int[sparseArray[0][0]][sparseArray[0][1]];
        for(int i = 1; i<sparseArray.length; i++){
            chessCon[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];

        }
        for(int[] row: chessCon){
            for(int data: row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }

}
