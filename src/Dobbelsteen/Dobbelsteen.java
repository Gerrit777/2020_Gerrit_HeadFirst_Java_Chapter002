package Dobbelsteen;

import java.util.Random;

public class Dobbelsteen {
    private int ogen = 0;

    public Dobbelsteen () {
        this.werp();
    }
    public int getOgen() {
        return ogen;
    }
    public void werp(){
        Random r = new Random();
        ogen = r.nextInt(6)+1;
        System.out.println(ogen);
    }
    public static void main(String[] args) {
       Dobbelsteen dobbelsteen = new Dobbelsteen();
    }
}
