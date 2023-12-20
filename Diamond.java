public class Diamond {

    public static void main(String[] args) {
        char inChar = 'B';
        int matrixSize = ((inChar - 'A') * 2) + 1;
        char[][] diamond = new char[matrixSize][matrixSize];

        char currentChar = 'A'-1; //Char position
        int middleIndex= diamond.length/2;
        for (int i = 0; i < (matrixSize/2)+1; i++) {
            currentChar++;
            for (int j = 0; j < matrixSize; j++) {
                if (j == middleIndex+i || j == middleIndex-i) {
                    diamond[i][j] = (char) ('A' + i);
                } else {
                    diamond[i][j] = '*';
                }
            }
        }
        for (int i = matrixSize / 2; i < matrixSize; i++) { // middle mirror
            for (int j = 0; j < matrixSize; j++) {
                diamond[i][j] = diamond[matrixSize - 1 - i][j];
            }
        }
        for (int i = 0; i < matrixSize; i++) { // full print
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(diamond[i][j] + " ");
            }
            System.out.println();
        }
    }
}