/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak102;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PRAK102 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        int i;
        int s;
        
        Scanner scaninput = new Scanner(System.in);

        System.out.println("Program Deret Aritmatik 1");
        System.out.print("Masukkan Angka: ");
        i = scaninput.nextInt();
        System.out.print("Masukkan Jumlah: ");
        s = scaninput.nextInt();
        
        while (i <= s){
            System.out.print(i + " ");
            i++;
            System.out.print(i / 2 - 1 + " ");
            i++;
        }
    }
}
