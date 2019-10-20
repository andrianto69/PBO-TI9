package manajemenasset;

import java.util.Date;
import java.util.Random;

public class Asset {
    public int no;
    public Pembelian pembelian;
    public Date date;
    public Asset (Pembelian pembelian) {
        this.no = new Random().nextInt(1000);
        this.pembelian = pembelian;
        this.date = new Date();
    }
    public void info() {
        System.out.println("No Asset : " + this.no);
        System.out.println("Nama Asset : " + this.pembelian.anggaran.pengajuan.subject);
        System.out.println("Harga Asset : " + this.pembelian.anggaran.pengajuan.price);
        System.out.println("Tanggal Asset : " + this.date);
    }
}
