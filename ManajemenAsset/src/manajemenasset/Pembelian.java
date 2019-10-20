package manajemenasset;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Pembelian {
    private int no;
    public User user;
    public Date date;
    public Anggaran anggaran;
    public String attachment;
    public List<Asset> list;
    public Pembelian(User user, Anggaran anggaran, String attachment) {
        this.no = new Random().nextInt(1000);
        this.user = user;
        this.date = new Date();
        this.anggaran = anggaran;
        this.attachment = attachment;
        this.list = new ArrayList<>();
        for (int i = 0; i < this.anggaran.pengajuan.qty; i++) {
            list.add(new Asset(this));
        }
    }
    public void info () {
        System.out.println("No Pembelian : " + this.no);
        System.out.println("User Pembeli : " + this.user.name);
        System.out.println("Tanggal Pembelian : " + this.date);
        System.out.println("Subyek Pengajuan : " + this.anggaran.pengajuan.subject);
        System.out.println("Nominal : " + this.anggaran.amount);
        System.out.println("Banyaknya Aset : " + this.list.size());
        System.out.println("Lampiran : " + this.attachment);
    }
}
