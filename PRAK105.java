/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak105;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class PRAK105_2110812710008_MTRIYUDHAR {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, t;
        final double PHI = 3.14;
        double volTabung;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("KALKULATOR VOLUME TABUNG");
        System.out.print("Jari-jari alas: ");
        r = scanInput.nextDouble();
        System.out.print("Tinggi tabung: ");
        t = scanInput.nextDouble();
        
        volTabung = (PHI * r * r) * t;
  
        System.out.println("Volume Tabung = " + volTabung);
    }  
}
