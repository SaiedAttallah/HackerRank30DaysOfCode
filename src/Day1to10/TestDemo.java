package Day1to10;

/**
 * Created by sattallah on 5/28/2017.
 */
public class TestDemo {
    public static int minPieces(int[] original, int[] desired) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int j = 0;
        for (int i = 0; i < original.length; i++){
            if (original[i] != desired[i]){
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] original = new int[] { 1, 4, 3, 2 };
        int[] desired = new int[] { 1, 2, 4, 3 };
        System.out.println(TestDemo.minPieces(original, desired));
    }
}
