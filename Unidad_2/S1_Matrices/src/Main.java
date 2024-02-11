public class Main {
    public static void main(String[] args) {
        int length = 5;
        int height = 5;
        int[][] matrixOne = new int[length][height];
        int[][] matrixTwo = new int[length][height];
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixOne[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = (int) (Math.random() * 10);
                System.out.print(matrixTwo[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        
        int[][] matrixOut = TheMatrix.matrixSum(matrixOne, matrixTwo);
        for (int i = 0; i < matrixOut.length; i++) {
            for (int j = 0; j < matrixOut[i].length; j++) {
                System.out.print(matrixOut[i][j] + " ");
            }
            System.out.println();
        }

    }
}
