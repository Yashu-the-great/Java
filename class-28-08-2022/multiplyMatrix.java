import java.util.Random;

public class multiplyMatrix {
 
    int arr1[][], arr2[][];

    multiplyMatrix(int row1, int col1, int row2, int col2) {
        this.arr1 = new int[row1][col1];
        this.arr2 = new int[row2][col2];
    }
    
    void inputMatrix(int arr[][]) {
        for(int i=0;i<arr.length;i+=1) {
            for(int j=0;j<arr[0].length;j+=1) {
                arr[i][j] = new Random().nextInt(10);
            }
        }
    }

    int[][] multipy(int arr1[][], int arr2[][]) {

        if(arr2.length != arr1[0].length) {
            return new int[0][0];
        }
        
        int ans[][] = new int[arr1.length][arr2[0].length];
    
        for(int i=0;i<arr1.length;i+=1) {

            for(int j=0;j<arr2[0].length;j+=1) {

                for(int k=0;k<arr2.length;k+=1) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return ans;
    }


    void display(int arr[][]) {
        System.out.println();
        for(int i=0;i<arr.length;i+=1) {
            for(int j=0;j<arr[0].length;j+=1) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
           multiplyMatrix m = new multiplyMatrix(2, 2, 2, 3);
           System.out.println("Array 1");
           m.inputMatrix(m.arr1);
           m.display(m.arr1);
           System.out.println("Array 2");
           m.inputMatrix(m.arr2);
           m.display(m.arr2);
           System.out.println();

           int[][] answer = m.multipy(m.arr1, m.arr2);

           System.out.println("Multiplied Matrix");
           m.display(answer);
    }
}