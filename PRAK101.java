/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PRAK101_2110817210008_MTRIYUDHAR {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, bplace, bdate;
        int height, weight;

        Scanner keyboard = new Scanner(System.in);
                
        System.out.print("Pembuatan Biodata\n");

        System.out.print("Masukkan Nama : ");
        nama = keyboard.nextLine();

        System.out.print("Tanggal lahir : ");
        bplace = keyboard.nextLine();

        System.out.print("Tempat Lahir : ");
        bdate = keyboard.nextLine();

        System.out.print("Tinggi Badan : ");
        height = keyboard.nextInt();

        System.out.print("Berat Badan : ");
        weight = keyboard.nextInt();
        
        System.out.println("Biodata Telah Dibuat.");
        System.out.println("Nama Saya :" + nama );
        System.out.println("Saya Lahir di :" + bplace );
        System.out.println("Pada Tanggal :" + bdate );
        System.out.println("Tinggi Badan :" + height + "cm");
        System.out.println("Berat badan :" + weight + "kg");
    }
}
