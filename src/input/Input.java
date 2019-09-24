/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.util.Scanner;

/**
 *
 * Nama : Fiqri Akbar Pratama
 * NIM  : 10118020  
 * Kelas: IF-1
 * Deskripsi Program : program ini berisi program untuk menampilkan
 * hasil inputan
 * 
 */

public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
