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
public class segitiga {
    int alas =12;
    int tinggi = 5;
    int sisi = 2;
    public void luas(){
        double luas=0.5*alas*tinggi;
        System.out.println("luas segitiga = "+luas);
        
    }
    public void keliling(){
        double keliling = sisi*alas*tinggi;
        System.out.println("keliling segitiga = "+keliling);
    }
    
}
