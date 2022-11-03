/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js10prakpbo;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class MobilUtama {
    public static void main(String[]args){
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merk /t: " + Honda.merk);
        System.out.println("Warna /t: " + Honda.warna);
        System.out.println("Tahun /t: " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
