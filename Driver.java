public class Driver {

    public static void main(String[] args) {
        System.out.println(diffrence(100));
    }

    private static double sumOfSquares(int num){
        int total = 0;
        for(int i = 1; i < num+1; i++){
           total += Math.pow(i, 2);
        }
        return total;
    }

    private static double squareOfSum(int num){
        double value = 0;
        for(int i = 1; i < num+1; i++ ){
            value += i;
        }
        value = Math.pow(value, 2);
        return value;
    }

    private static double diffrence(int num){
        double result;
        result = squareOfSum(num) - sumOfSquares(num);
        return result;
    }


}
