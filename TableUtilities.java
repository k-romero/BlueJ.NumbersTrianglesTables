 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String myRow = "";
        String singleSpace = " ";
        String doubleSpace = "  ";
        String mySymbol = " |";
        String myBreak = "\n";
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++){
                if (j*i < 10){
                    myRow += doubleSpace;
                } else if (j*i < 100) {
                    myRow += singleSpace;
                }
                myRow += j*i;
                myRow += mySymbol;
            }
            myRow += myBreak;
        }
       return myRow;
    }
}
