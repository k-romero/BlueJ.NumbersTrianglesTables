


public class NumberUtilities {

    public static String getRange(int stop) {
        String myString = "";
        for (int i = 0; i < stop; i++){
            myString += i;
        }
        return myString;
    }

    public static String getRange(int start, int stop) {
        String myString = "";
        for (int i = start; i < stop; i++){
            myString += i;
        }
        return myString;
    }


    public static String getRange(int start, int stop, int step) {
        String myString = "";
        for (int i = start; i < stop; i += step){
            myString += i;
        }
        return myString;
    }

    public static String getEvenNumbers(int start, int stop) {
        String myString = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                myString += i;
            }
        }
        return myString;
    }


    public static String getOddNumbers(int start, int stop) {
        String myString = "";
        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                myString += i;
            }
        }
        return myString;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String myString = "";
        int result = 1;
        for (int i = start; i <= stop; i++){
               result *= Math.pow(i,exponent);
               myString += result;
               result = 1;      
        }
        return myString;
    }
}
