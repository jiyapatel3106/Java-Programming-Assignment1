//Program 2:
// Develop Matrix class with constructors, transpose and
// Multiplication.


public class Program2 {
    private int rows;
    private int cols;
    private int[][] data;

    public Program2(int[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Program2 transpose() {
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = data[i][j];
            }
        }
        return new Program2(transposed);
    }

public Program2 multiply(Program2 other) {
if (this.cols != other.rows) {
throw new IllegalArgumentException("Matrix dimensions do not match for multiplication");
}
int[][] result = new int[this.rows][other.cols];
for (int i = 0; i < this.rows; i++) {
for (int j = 0; j < other.cols; j++) {
for (int k = 0; k < this.cols; k++) {
result[i][j] += this.data[i][k] * other.data[k][j];
}
}
}
return new Program2(result);
}

    // Main method for testing
    public static void main(String[] args) {
        int[][] aData = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] bData = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };
        Program2 A = new Program2(aData);
        Program2 B = new Program2(bData);
        System.out.println("Matrix A:");
        A.print();
        System.out.println("\nTranspose of A:");
        A.transpose().print();
        System.out.println("\nMatrix B:");
        B.print();
        System.out.println("\nA * B:");
        A.multiply(B).print();
    }
}