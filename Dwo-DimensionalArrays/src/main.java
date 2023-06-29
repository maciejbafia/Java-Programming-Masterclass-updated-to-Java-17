import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2));

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i]; //var automatycznie przypisuje prawidłowy typ
            for (int j = 0; j < innerArray.length; j++) { //pętla przechodzi przez każdy element pętli w pętli
            //    System.out.print(array2[i][j] + " ");
                array2[i][j] = (i*10) + (j+1);
            }
        }
        System.out.println();

        for (var outer : array2){ //if we use vvar keyword java will declare type
            for(var element : outer){
                System.out.print(element+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{ // na 2 miejscu w anyArray stworzyliśmy String[][] bez określonych rozmiarów z trzema listami
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int [2][2][2]; // na 3 miejscu jest 2 elementa array of 2 elements of 2 elements
        System.out.println(Arrays.deepToString(anyArray));
    }

}
