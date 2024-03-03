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
public class TataUsaha extends Guru {
    private String bagian;
    
public TataUsaha(String nip,String nama,String jeniskelamin, String bagian){
    super (nip,nama,jeniskelamin);
    this.bagian = bagian;   
}    
public void viewTataUsaha(){
    System.out.println("bagian :"+bagian);
}
}
    
 

    

