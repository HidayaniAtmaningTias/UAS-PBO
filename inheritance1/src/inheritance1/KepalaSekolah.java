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
public class KepalaSekolah extends Guru {
    private int tahunMulai;
    private int jabatanke;
    
public KepalaSekolah (String nip, String nama, String jeniskelamin, int tahunMulai, int jabatanke){
    super (nip, nama,jeniskelamin);
    this.tahunMulai = tahunMulai;
    this.jabatanke= jabatanke;
  
} 
public void viewKepalaSekolah(){
    System.out.println("Tahunmulai jabatan:"+tahunMulai);
    System.out.println("Jabatan KepalaSekolah ke-:"+jabatanke);
    System.out.println("");
}
    
    
}


   
