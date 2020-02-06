 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String myRow = "";
        String mySymbol = "*";   
        for (int i = 0; i < numberOfStars; i++){
            myRow += mySymbol;
        }
        return myRow;
    }
    
    public static String getTriangle(int numberOfRows) {
        String myRow = "";
        String mySymbol = "*";
        String myBreak = "\n";
        for (int i = 1; i <= numberOfRows; i++){
            for (int j = 0; j < i; j++){
                myRow += mySymbol;
            }
            myRow += myBreak;
        }
       return myRow;
    }


    public static String getSmallTriangle() {
        String myRow = "";
        String mySymbol = "*";
        String myBreak = "\n";
        for (int i = 1; i <= 4; i++){
            for (int j = 0; j < i; j++){
                myRow += mySymbol;
            }
            myRow += myBreak;
        }
       return myRow;
    }

    public static String getLargeTriangle() {
        String myRow = "";
        String mySymbol = "*";
        String myBreak = "\n";
        for (int i = 1; i <= 9; i++){
            for (int j = 0; j < i; j++){
                myRow += mySymbol;
            }
            myRow += myBreak;
        }
       return myRow;
    }
}
