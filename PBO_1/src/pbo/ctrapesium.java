/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import javax.swing.JOptionPane;

/**
 *
 * @author moklet gaming 1
 */
public class ctrapesium {
    int alas;
    int tinggi;
    int sisi;
    public ctrapesium(){
        this.sisi=sisi;
    }
    public void luas(){
    int luas=alas*tinggi;
    JOptionPane.showMessageDialog(null, "luas = "+luas);
    
}
    public void keliling(int sisi){
        int keliling = 2*alas*2*tinggi;
        JOptionPane.showMessageDialog(null,"keliling = "+keliling);
    }
    public static void main(String[] args) {
        cpersegi c= new cpersegi();
        c.sisi=Integer.parseInt(JOptionPane.showInputDialog("sisi = "));
        c.luas();
        c.keliling(c.sisi);
    }
}

