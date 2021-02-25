/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNonVoid;

/**
 *
 * @author Yusuf Isra
 */
public class Luas2 {
    int sisi;
    int hasil;
    
    void Luas(int sisi){
        this.sisi = sisi;
    }
    
    int sisi(){
        return sisi;
    }
    
    int Cetak(){
        hasil = sisi*sisi;
        System.out.println("Luas dari persegi yang memiliki sisi sebesar "+sisi+" adalah :"+hasil);
        return hasil;
    }
}
