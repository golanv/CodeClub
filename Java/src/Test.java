/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Test {
    public static void main(String[] args) {
        int z = 100;
        String x = Num.toHex(z);
        System.out.println(x);
        String y = Num.toBin(z);
        System.out.println(y);
    }
}
