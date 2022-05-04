/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distributoredibevande;

import distributoredibevande.Enum.Bcalde;
import distributoredibevande.Enum.Bfredde;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Test {

    public final static void init() {
        Distributore.getInstance().load(
                new BevandaCalda(Bcalde.CAFFE, 0.40d, 1, 12),
                new BevandaFredda(Bfredde.ACQUA, 1.0d, 1, 13),
                new BevandaCalda(Bcalde.CAPPUCCINO, 1.00d, 2, 8));
    }

    public static void main(String[] args) {
        init();
    }

}
