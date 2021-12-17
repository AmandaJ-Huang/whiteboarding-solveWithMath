public class MainApp {

    public static Integer solveWithMath(Integer[] input) {
        Integer sum = 0;
        Integer multiplier = input.length;

        for(int i = 0; i < input.length; i++) {
            sum += (input[i] * (i+1) * (multiplier-i));
        }

        return sum;
    }
}
