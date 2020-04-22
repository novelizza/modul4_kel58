package modul4_kelompok58;

import java.util.Scanner;

public class Modul4_Kelompok58 {

    static void banner(){
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("--------------------------------Bank NouRi------------------------------------");
        System.out.println("==============================================================================");
        System.out.println("1. Buat Nasabah Baru");
        System.out.println("2. Tarik Uang");
        System.out.println("3. Setor Uang");
        System.out.println("4. Cek Saldo");
        System.out.println("-------------------------------------------------------------------------------");
    }
    
    static void garis(){
        System.out.println("-----------------------------------------------------------------");
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        data a = new data();
        double NoRek;
        String Password;
        
        while (true) {
            banner();

            System.out.println("Silahkan Masukan Pilihan : ");
            int pilih = in.nextInt();
        
        switch(pilih){
            case 1:
            garis();
            System.out.println("========================Buat Rekening Baru=======================");
            garis();
            System.out.println("Nomer Rekening : ");
            double Rekening = in.nextDouble();
            System.out.println("Masukan Nama Calon Nasabah : ");
            in.nextLine();
            String NamaCalon = in.nextLine();
            System.out.println("Masukan Passworld : ");
            Password = in.nextLine();
            System.out.println("Masukan Alamat Calon Nasabah : ");
            String AlamatNasabah=in.nextLine();
            System.out.println("Masukan Nomer Telepon Calon Nasabahah : ");
            double NoTelepon = in.nextDouble();
            a.setData(Rekening,NamaCalon,AlamatNasabah,NoTelepon,Password);
            garis();
            System.out.println("Nomer Rekening : "+Rekening);
            System.out.println("Nama Calon Nasabah : "+NamaCalon);
            System.out.println("Alamat Nasabah : "+AlamatNasabah);
            System.out.println("Nomer Telepon Nasabah : "+NoTelepon);
            garis();
            in.nextLine();
            in.nextLine();
            break;
            
            case 2:
            garis();
            System.out.println("===========================Tarik Uang=========================================");
            garis();
            System.out.println("Masukan Nomer Rekening : ");
            NoRek = in.nextDouble();
            System.out.println("Masukan Password : ");
            in.nextLine();
            Password = in.nextLine();
            a.setTarik(NoRek,Password);
            in.nextLine();
            break;    
            
            case 3:
            garis();
            System.out.println("===========================Simpan Uang==========================");
            garis();
            System.out.println("Masukan Nomer Rekening : ");
            NoRek = in.nextDouble();
            System.out.println("Masukan Password : ");
            in.nextLine();
            Password = in.nextLine();
            a.setSetor(NoRek, Password);
            in.nextLine();
            break;

            case 4:
            garis();
            System.out.println("===========================Cek Saldo============================");
            garis();
            System.out.println("Masukan Nomer Rekening : ");
            NoRek = in.nextDouble();
            System.out.println("Masukan Password : ");
            in.nextLine();
            Password = in.nextLine();
            a.lihatSaldo(NoRek, Password);
            in.nextLine();
            break;
            default:System.out.println("Anda salah memasukkan pilihan!");break;
        }
        }//tutup while global 
    }
}
