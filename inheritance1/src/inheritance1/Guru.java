/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author lenovo
 */
public class Guru {
 private String nip;
 private String nama;
 private String jeniskelamin;
 
public Guru (String nip, String nama, String jeniskelamin) {
    this.nip = nip;
    this.nama = nama;
    this.jeniskelamin = jeniskelamin;
}    
public void viewGuru(){
    System.out.println("NIP : " +nip);
    System.out.println("Nama : " +nama);
    System.out.println("Jenis Kelamin : " +jeniskelamin);
        
}
}

    

