public class Main {

    static int[][] arrMult(int[][] a, int[][] b){

        int[][] arr = new int[a.length][b[0].length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){

                arr[i][j] = 0;

                for (int k = 0; k < b.length; k++){
                    arr[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[][] a = new int [2][3];
        a[0] = new int[]{3, 1, 2};
        a[1] = new int[]{0, -1, 4};

        int[][] b = new int [3][2];
        b[0] = new int[]{-1, 1};
        b[1] = new int[]{2, 0};
        b[2] = new int[]{0, 3};

        int[][] arr = arrMult(b, a);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
