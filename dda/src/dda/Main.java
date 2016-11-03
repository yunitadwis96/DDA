/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dda;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author CHHANNZ
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public Main() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                     
        JFrame frame = new JFrame("Garis DDA"); //judul output frame (modifikasi)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //menutup program
        garis grs2 = new garis();        //memangil fungsi garis
        grs2.setx1(28);   //10           //mengatur besarnya x1 (modifikasi)
        grs2.sety1(90);   //20           //mengatur besarnya y1 (modifikasi)
        grs2.setx2(109);  //100          //mengatur besarnya x2 (modifikasi)
        grs2.sety2(106);  //60           //mengatur besarnya y2 (modifikasi)
        grs2.setBackground(Color.PINK); //memanggil fungsi pengaturan background (modifikasi)
        frame.add(grs2);                 //menampilkan garis ke frame
        frame.setSize(900,600);//600,480 //menentukan besar frame yang akan ditampilkan (modifikasi)
        frame.setVisible(true);         //
    }
}
