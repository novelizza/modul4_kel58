/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4_kelompok58;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class data {
    private double NomerRekening, NomorTelepon;
    private String NamaCalonNasabah, AlamatNasabah, Password;     
    private int saldo;
    public int TabunganAwal= 50000;
    Scanner in = new Scanner(System.in);

    public void setData(double NomerRekening,String NamaCalonNasabah, String AlamatNasabah, double NomorHP, String pass) {
        this.NomerRekening = NomerRekening;
        this.NomorTelepon = NomorHP;
        this.NamaCalonNasabah = NamaCalonNasabah;
        this.AlamatNasabah = AlamatNasabah;
        this.Password=pass;
        saldo = TabunganAwal;
    }
    
    public String getNamaCalonNasabah() {
        return NamaCalonNasabah;
    }
    
    public double getNomerRekening(){
        return NomerRekening;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public void setTarik(double NomerRek, String pass) {
        if(this.getNomerRekening() == NomerRek && this.getPassword().equals(pass)){
            System.out.println("Masukan uang yang akan di Tarik : ");
            int UangDiTarik = in.nextInt();
            this.saldo = this.saldo - UangDiTarik;
            System.out.println("========================================================");
            System.out.println("Penarikan Sukses!");
            System.out.println("========================================================");
            System.out.println("Nomer Rekening Anda     : "+NomerRek);
            System.out.println("Jumlah Penarikan    : "+UangDiTarik);
            System.out.println("Saldo               :"+this.getSaldo());
        } else {
            System.out.println("Norek atau password salah");
        }
    }
    
    public void setSetor(double NomerRek, String pass) {
        if(this.getNomerRekening() == NomerRek && this.getPassword().equals(pass)){
            System.out.println("Masukan uang yang akan di setor : ");
            int UangDiSetor = in.nextInt();
            this.saldo = this.saldo + UangDiSetor;
            System.out.println("========================================================");
            System.out.println("Setor Sukses!");
            System.out.println("========================================================");
            System.out.println("Nomer Rekening Anda     : "+NomerRek);
            System.out.println("Jumlah Setroran    : "+UangDiSetor);
            System.out.println("Saldo               :"+this.getSaldo());
        } else {
            System.out.println("Norek atau password salah");
        }
    }
    
    public void lihatSaldo(double NomerRek, String pass) {
        if(this.getNomerRekening() == NomerRek && this.getPassword().equals(pass)){
            System.out.println("Saldo anda "+this.getSaldo());
        } else {
            System.out.println("Norek atau password salah");
        }
    } 
}
