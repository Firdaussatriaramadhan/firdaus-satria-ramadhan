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
public class trapesium {
 int alas =15;
    int tinggi = 6;
    int sisi = 7;
    public void luas(){
        double luas=tinggi *alas;
        System.out.println("luas trapesium = "+luas);
        
    }
    public void keliling(){
        double keliling = 2*alas*2*tinggi;
        System.out.println("keliling trapesium = "+keliling);
    }
}
