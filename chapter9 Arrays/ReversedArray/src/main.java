import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] notreverse ={1,2,3,4,5};
        reverseFaster(notreverse);
        //int[] reverse = reverse(notreverse);
        System.out.println(Arrays.toString(notreverse));
    }

    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0; i<array.length; i++){
            reversed[i] = array[(array.length - i -1)]; //wskazujemy na ostatni index
        }return reversed;
        }
    public static void reverseFaster(int[] array){ // nie zwraca nic ponieważ działa na jednej liście

        int maxIndex = array.length -1;
        int halfLength = array.length/2;

        for(int i = 0; i<halfLength; i++){
            int temp = array[i]; // move 1st element t temp
            array[i] = array[maxIndex -i]; // set value of last Index to first element i odejmujemy i (przy pierwszej iteracji 0)
            array[maxIndex -i] = temp; // podmieniamy ostatni element -0 na temp
        }

    }
    }

