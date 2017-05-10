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

    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        System.out.println(shapes.triangle(5));
    }

}






