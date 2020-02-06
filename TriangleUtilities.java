 

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
        String myTriangle = "";
        String myRow = "";
        String mySymbol = "*";
        String myBreak = "\n";
        for (int i = 1; i <= numberOfRows; i++){
            for (int j = 0; j < i; j++){
                myRow += mySymbol;
            }
            myRow += myBreak;
            myTriangle += myRow;
        }
       return myRow;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
