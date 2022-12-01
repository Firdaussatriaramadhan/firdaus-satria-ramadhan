/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class NILAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner (System.in);
        System.out.println("masukkan nilai =");
        int nilai = in.nextInt();
        if (nilai > 90){
            System.out.println("kerja yang bagus nilai anda "+nilai+"dengan ini anda tidak perlu remedial");
        }else if(nilai > 80){
            System.out.println("selamat anda mendapatkan nilai "+nilai+"dengan begini anda tidak perlu remedial");
        }else if(nilai > 70){
            System.out.println("ada beberapa yang harus ditingkatkan karena nilai anda "+nilai+ "mungkin anda perlu remedial");
        }else if(nilai > 60){
            System.out.println("belajarlah lebih giat karena nilai anda "+nilai+"anda perlu remedial");
        }else{
            System.out.println("kerjakan remedial dan terus belajar karena nilai anda "+nilai);
        }
        // TODO code application logic here
    }
    
}
