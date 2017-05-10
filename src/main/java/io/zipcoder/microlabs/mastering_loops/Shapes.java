package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(int n) {
        String output = "triangle()\n*** Output ***";
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }return stars;

    }

    public void runIt(int rows){
        int counter = 0;
        while (counter != rows){
            System.out.println(triangle(counter));
            System.out.print("\n");
            counter++;
        }
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.runIt(5);
    }


    public String tableSquare(){
        return "";
    }

    public String tableSquares(int n){
        return "";
    }
}
