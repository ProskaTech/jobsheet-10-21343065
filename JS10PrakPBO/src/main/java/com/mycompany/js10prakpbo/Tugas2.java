/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js10prakpbo;

/**
 * created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
import java.util.Scanner;
public class Tugas2 {
    String nama, nim, smt;
    float ip;
    
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine(); 
        System.out.print("Masukkan NIM Mahasiswa : ");
        nim = input.nextLine(); 
        System.out.print("Masukkan Semester Mahasiswa : ");
        smt = input.nextLine(); 
        System.out.print("Masukkan IP Mahasiswa : ");
        ip = input.nextFloat(); 
    }
    
    public void NilaiIP(){
        if(ip >= 3.5){
            System.out.println(" Anda Berhak Mengontrak 24 SKS Pada Semester " + smt);
        }
        else if((ip < 3.5) && (ip >= 3.0)){
            System.out.println(" Anda Berhak Mengontrak 22 SKS Pada Semester "+ smt);
        }
        else if((ip < 3.0) && (ip >= 2.5)){
            System.out.println(" Anda Berhak Mengontrak 20 SKS Pada Semester " + smt);
        }
        else if((ip < 2.5) && (ip >= 2.0 )){
            System.out.println(" Anda Berhak Mengontrak 18 SKS Pada Semester " + smt);
        }
        else{
            System.out.println(" Anda Berhak Mengontrak 15 SKS Pada Semester " + smt);
        }
    } 
     public void Tampil(){
        System.out.println("Nama            : " +nama);
        System.out.println("NIM             : " +nim);
        System.out.println("Semester        : " +smt);
        System.out.println("IP Semester ini : " +ip);
    }
}
