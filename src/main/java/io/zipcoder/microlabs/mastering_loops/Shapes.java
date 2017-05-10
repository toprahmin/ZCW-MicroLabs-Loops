package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(int n) {

        String sysout = "triangle()\n*** Output ***";
        String stars = "";
        for (int i = 1; i <= n; i++) {
            stars += "\n";
            for (int j = 0; j < i; j++) {
                stars += "*";
            }

        }
        return sysout + stars;
    }

    public String tableSquare() {
        String squareOut = "tableSquare()\n*** Output ***";
        String numbers = "";
        for (int i = 1; i <= 4; i++){
            numbers += "\n" + "|";
            for(int j = 1; j <= 4; j++){
                numbers = numbers  + (i * j) + "|";
            }
        }
        return squareOut + numbers;
    }

    public String tableSquares(int n){
        String squareOut = "tableSquares()\n*** Output ***";
        String numbers = "";
        for (int i = 1; i <= n; i++){
            numbers += "\n" + "|";
            for(int j = 1; j <= n; j++){
                numbers = numbers  + (i * j) + "|";
            }
        }
        return squareOut + numbers;

    }



    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        System.out.println(shapes.triangle(5));
    }

}






