/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak103;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PRAK103_2110817210008_MTRIYUDHAR {
    public static void main(String[] args) {
        // TODO code application logic here
        int i, reversed = 0;
        int s;
        
        Scanner scaninput = new Scanner(System.in);

        System.out.println("Program Deret Aritmatik 2");
        System.out.print("Masukkan Angka: ");
        i = scaninput.nextInt();

        System.out.print("Masukkan Jumlah: ");
        s = scaninput.nextInt();
        
        do {

        System.out.print(i +" ");
        i++;
        if ( i % 7 == 0){
        continue;
        }
        }while (i <= s);
    }
}
