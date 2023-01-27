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
public class lingkaran {
    double phi = 3.14;
    double jari = 14.0;
    public void luaslingkaran(){
        double luaslingkaran = phi*jari*jari;
        System.out.println("luas lingkaran "+luaslingkaran);
    }
    public void kelilinglingkaran(){
        double keliling = 2*phi*jari;
        System.out.println("keliling lingkaran "+keliling);
    }
}
