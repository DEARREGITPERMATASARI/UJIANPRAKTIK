import java.util.Scanner;
public class TOKODEAR {
    public static void main(String[] args){
        System.out.println("Toko Dear Syariah");
        System.out.println("Jl.Jomblo Bahagia");
        System.out.println("Selamat Datang Di Toko Dear Syariah");
        Scanner scanner = new Scanner (System.in);
        
        //Harga barang
        int n = 1000;
        int Pensil = n;
        System.out.println("Harga Pensil = Rp "+n);
        
        int a = 2500;
        int Penghapus = a;
        System.out.println("Harga Penghapus = Rp "+a);
        
        int u = 2500;
        int Buku = u;
        System.out.println("Harga Buku = Rp "+u);
        
        int f = 100000;
        int Tas = f;
        System.out.println("Harga Tas = Rp "+f);
        
        int l = 2500;
        int Bolpoin = l;
        System.out.println("Harga Bolpoin = Rp "+l);
        
        System.out.println("Berapa Pensil yang di beli?");
        int JumlahPensil = scanner.nextInt();
        
        System.out.println("Jumlah harga Pensil yang di beli adalah = " + JumlahPensil);
        int JumlahHargaPensil = n*JumlahPensil;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPensil);
        
        System.out.println("Berapa Penghapus yang di beli?");
        int JumlahPenghapus = scanner.nextInt();
        
        System.out.println("Jumlah harga Penghapus yang di beli adalah = " + JumlahPenghapus);
        int JumlahHargaPenghapus = a*JumlahPenghapus;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPenghapus);
        
        System.out.println("Berapa Buku yang ingin anda beli?");
        int JumlahBuku = scanner.nextInt();
        System.out.println("Jumlah harga Buku yang di beli adalah = " + JumlahBuku);
        int JumlahHargaBuku = u*JumlahBuku;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBuku);
        
        System.out.println("Berapa Tas yang ingin anda beli?");
        int JumlahTas = scanner.nextInt();
        System.out.println("Jmlah harga Tas yang di beli adalah = " + JumlahTas);
        int JumlahHargaTas = f*JumlahTas;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaTas);
        
        System.out.println("Berapa Bolpoin yang ingin anda beli?");
        int JumlahBolpoin = scanner.nextInt();
        System.out.println("Jmlah harga Bolpoin yang di beli adalah = " + JumlahBolpoin);
        int JumlahHargaBolpoin = l*JumlahBolpoin;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBolpoin); 
        
        int TotalBarang = JumlahHargaPensil + JumlahHargaPenghapus + JumlahHargaBuku +
                             JumlahHargaTas + JumlahHargaBolpoin;
        
        System.out.println("       ");
        System.out.println("====TOTAL HARGA====");
        
        if (TotalBarang >= 500000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 500000 diskon 50%");
               int TotalSetelahDiskon = (TotalBarang / 2);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
        }
        else if (TotalBarang >= 200000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 200000 diskon 20%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *2/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else if (TotalBarang >= 100000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 100000 diskon 10%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *1/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else System.out.println("Total Harga = "+"Rp "+ TotalBarang);
        System.out.println("Kasir : Dear Regita");
        
        System.out.println("--- Terimaksih Sudah Belanja Disini ---");
        System.out.println("Jangan Lupa Datang Kembali");
        System.out.println("Semoga Barang Belanjaan Anda bisa Menjadi Berkah");
    }
}