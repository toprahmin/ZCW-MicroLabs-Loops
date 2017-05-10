package io.zipcoder.microlabs.mastering_loops;


public class Numbers {

    public String oneToTen(){
        String numbers = "oneToTen()\n*** Output ***";
        for(int i = 1; i < 11; i++){
            numbers = numbers + "\n" + i;
        }
        return numbers;
    }

    public String oddNumbers() {
        String oddNumbers = "oddNumbers()\n*** Output ***";
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                oddNumbers = oddNumbers + "\n" + Math.pow(i, 2);
            }
        }
        return oddNumbers;
    }



    public String squares(){
        String squares = "Squares()\n*** Output ***";
            for(int i = 1; i < 11; i++){
                squares = squares + "\n" + i * i;
            }
        return squares;
    }

    public String random4(){

        return "";
    }

    public String even(int n){
        String evenNumbers = "even()\n*** Output ***";
        for(int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenNumbers = evenNumbers + "\n" + i;
            }
        }
        return evenNumbers;
    }

    public String powers(int n){
        String powerUps = "powers()\n*** Output ***";
        for (int i = 1; i <= n; i++){
            powerUps = powerUps + "\n" + (int) Math.pow(2,i);
        }
        return powerUps;
    }

}
