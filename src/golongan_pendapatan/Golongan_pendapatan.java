/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golongan_pendapatan;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class Golongan_pendapatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String isi;
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan nama");
        in.nextLine();
        System.out.println("masukkan jalur masuk dan golongan pendapatan");
        isi = in.nextLine();
        switch(isi){
            case"SMBPTN A":
                System.out.println("DSP = 5 juta dan SPP = 500 ribu");
                break;
                case"SMBPTN B":
                    System.out.println("DSP = 15 juta dan SPP = 1 juta");
                    break;
                case"SMBPTN C":
                    System.out.println("DSP = 30 juta dan SPP = 2 juta");
                    break;
                case"SNMPTN A":
                    System.out.println("DSP = 7 juta dan SPP = 500 ribu");
                    break;
                case"SNMPTN B":
                    System.out.println("DSP = 17 juta dan SPP = 1 juta");
                    break;
                case"SNMPTN C":
                    System.out.println("DSP = 35 juta dan SPP = 2 juta");
                    break;
                case"MANDIRI A":
                    System.out.println("DSP = 10 juta dan SPP 1 juta");
                    break;
                case"MANDIRI B":
                    System.out.println("DSP = 25 juta dan SPP = 2 juta");
                    break;
                case"MANDIRI C":
                    System.out.println("DSP = 50 juta dan SPP = 3 juta");
                    break:
                    
                    
        }
        
        // TODO code application logic here
    }
    
}
