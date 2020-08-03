package Day14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    protected void computeDifference() {
        int maxNum, minNum;
        maxNum = elements[0];
        minNum = maxNum;

        for (int i = 1; i < elements.length; i++) {
            maxNum = elements[i] > maxNum ? elements[i]:maxNum;
            minNum = elements[i] > minNum ? minNum:elements[i];
        }

        maximumDifference = Math.abs(maxNum-minNum);
    }
}
