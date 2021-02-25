/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodVoid;

/**
 *
 * @author Yusuf Isra
 */
public class Luas {
    int sisi;
    int hasil;
    
    void Luas (int sisi){
    this.sisi = sisi;
    }
    
    void Cetak(){
    hasil = sisi*sisi;
    System.out.println("Luas dari persegi yang memiliki sisi sebesar "+sisi+" adalah :"+ hasil);
}
}
