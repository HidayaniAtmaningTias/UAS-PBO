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
public class Inheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    KepalaSekolah KepalaSekolah = new KepalaSekolah("1023459","Rezeki","Laki-laki", 2006,3);
    TataUsaha TataUsaha = new TataUsaha ("102323","Atma","Perempuan","Keuangan");
    
   KepalaSekolah.viewGuru();
   KepalaSekolah.viewKepalaSekolah();
    
   TataUsaha.viewGuru();
   TataUsaha.viewTataUsaha();
   }
   
}
    
    

