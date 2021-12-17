public class MainApp {
    public static void main(String[] args) {

    }

    public Integer solveWithMath(Integer[] input) {
        Integer sum = 0;

        for(int i = 0; i < input.length; i++) {
            sum += input[i] * i;
        }

        return sum;
    }
}
