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
public class cpersegi {
    int sisi;
    public cpersegi(){
        this.sisi=sisi;
    }
    public void luas(){
    int luas=sisi*sisi;
    JOptionPane.showMessageDialog(null, "luas = "+luas);
    
}
    public void keliling(int sisi){
        int keliling = 4*sisi;
        JOptionPane.showMessageDialog(null,"keliling = "+keliling);
    }
    public static void main(String[] args) {
        cpersegi c= new cpersegi();
        c.sisi=Integer.parseInt(JOptionPane.showInputDialog("sisi = "));
        c.luas();
        c.keliling(c.sisi);
    }
}
