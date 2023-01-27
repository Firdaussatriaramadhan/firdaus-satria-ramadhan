/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author moklet gaming 1
 */
public class tampilprogram {
    public static void main(String[] args) {
        lingkaran ling = new lingkaran();
        segitiga segi = new segitiga();
        persegi per = new persegi();
        persegi_panjang1 pers = new persegi_panjang1();
        trapesium tra = new trapesium();
        System.out.println("trapesium");
        tra.keliling();
        tra.luas();
        System.out.println("persegi panjang");
        pers.luas();
        pers.keliling();
        System.out.println("persegi");
        per.luas();
        per.keliling();
        System.out.println("segitiga");
        segi.luas();
        segi.keliling();
        System.out.println("lingkaran");
        ling.kelilinglingkaran();
        ling.luaslingkaran();
        
    }
    
    
}
