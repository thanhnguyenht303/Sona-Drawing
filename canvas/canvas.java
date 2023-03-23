package canvas;


import java.util.Arrays;


public class canvas {

    private int[] coordinate;
    private int[] status;

    public static void main(String args[]){
        int m = 5;
        int n = 10;
        // small setup for showing, could be bigger by changing the numb
        int[][] status[] = new int[m][n][];      //create array storing status
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                status[i][j] = new int[]{1, 1, 1};
            }
        }


        //test the availability
        System.out.println("print the canvas------------------------");
        for(int i=0; i<status.length; i++){
            for(int j=0; j<status[0].length; j++){
                System.out.print(Arrays.toString(status[i][j])+"\t");
            }
            System.out.println();
        }
        System.out.println("print test------------------------");



        int[] a = status[1][1];
        int[] b = status[2][2];

        int[] c = new int[a.length];
        int index = 0;

        for (int i : a) {
            for (int j : b) {
                c[index] = i + j;
                b = Arrays.copyOfRange(b, 1, b.length);
                index = index + 1;
                break;
            }
        }
        System.out.println(Arrays.toString(c));
            //coordinate with status successfully stored in Integer form
            //capable of doing calculation based on it
        System.out.println(Arrays.toString(status[0][0]));

    }

}
