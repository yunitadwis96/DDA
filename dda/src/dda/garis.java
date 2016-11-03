/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dda;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHHANNZ
 */
public class garis extends JPanel { //fungsi untuk membuat garis
    private int x1;     //kamus untuk x1 sebagai titik awal x
    private int y1;     //kamus untuk y1 sebagai titik awal y
    private int x2;     //kamus untuk x2 sebagai titik akhir x
    private int y2;     //kamus untuk y2 sebagai titik akhir y
    
   
    
    public int getx1() {  //fungsi untuk memanggil x1
        return x1;        //mengembalikan x1
    }
    
    public int getx2() {    //fungsi untuk memanggil x2
        return x2;          //mengembalikan x2
    }
    
    public int gety1() { //fungsi untuk memanggil y1
        return y1;      //mengembalikan y1
    }
    
    public int gety2() { //fungsi untuk memanggil y2
        return y2;      //mengembalikan y2
    }
    
    public void setx1(int xa) { //memasukkan nilai xa ke dalam x1
        x1 = xa;                //jadi nilai x1=xa
    }
    
    public void setx2(int xb) { //memasukkan nilai xb ke dalam x2
        x2 = xb;                //jadi nilai x2=xb
    }
    
    public void sety1(int ya) { //memasukkan nilai ya ke dalam y1
        y1 = ya;                //jadi nilai y1=ya
    }
    
    public void sety2(int yb) { //memasukkan nilai yb ke dalam y2
        y2 = yb;                //jadi nilai y2=yb
    }
    
       
    @Override
    public void paint(Graphics g) { //fungsi untuk membuat garis
        int dx = x2-x1;             //rumus dx
        int dy = y2-y1;             //rumus dy
        int steps,k;                //jenis type data untuk steps dan k

        float x=x1;                 //rumus bahwa x=x1
        float y=y1;                 //rumus bahwa y=y1
        float x_inc,y_inc;          //jenis type data untuk x_inc dan y_inc, inc = perubahan titik/titik selanjutnya
        

        super.paint(g);                     //memanggil turunan dari fungsi paint
        this.setBackground(Color.PINK);    //mengatur jenis warna background (modifikasi)
        g.setColor(Color.GRAY);              //mengatur jenis warna garis    (modifikasi)

        if(Math.abs(dx)>Math.abs(dy)) steps = Math.abs(dx);  //kondisi untuk menentukan steps dimana jika dx>dy maka dx
        else steps = Math.abs(dy);                           //jika tidak maka dy

        x_inc = dx/(float)steps;             //rumus untuk menentukan nilai x_inc
        y_inc = dy/(float)steps;             //rumus untuk menentukan nilai y_inc

        g.drawRect(Math.round(x), Math.round(y), 1, 1); //fungsi untuk membulatkan nilai x dan y dan (1,1) untuk menentukan besar titik
        for(k=0;k<steps;k++) {                  //looping untuk menentukan posisi titik selanjutnya
            x+=x_inc;                           //rumus menetukan perubahan x titik selanjutnya
            y+=y_inc;                           //rumus menetukan perubahan y titik selanjutnya
            g.drawRect(Math.round(x), Math.round(y), 1, 1);
        }
      
    }
    
    public garis() {
    
    }
}
