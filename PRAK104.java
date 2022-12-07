/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104;

import java.util.Scanner;
public class PRAK104_2110817210008_MTRIYUDHAR {

    public static void main(String[] args) {

        int andi;
        int budi;
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("Permainan Kartu Remi");
        
        System.out.print("Kartu Andi: ");
        andi = scanInput.nextInt();
        andi = scanInput.nextInt();
        andi = scanInput.nextInt();
        
        System.out.print("Kartu Budi: ");
        budi = scanInput.nextInt();
        budi = scanInput.nextInt();
        budi = scanInput.nextInt();
        
        if (andi>budi){
            System.out.println("Andi Menang");
        }else if(andi == budi){
            System.out.println("Seri");
        }else{
            System.out.println("Budi Menang");
        }
    }  
}
