package manajemenasset;

import java.util.Date;
import java.util.Random;

public class Anggaran {
    private int no;
    public User user;
    public Date date;
    public Pengajuan pengajuan;
    public double amount;
    public Boolean acc;
    public String accNote;
    public User accUser;
    public Anggaran(User user, Pengajuan pengajuan) {
        this.no = new Random().nextInt(1000);
        this.user = user;
        this.date = new Date();
        this.pengajuan = pengajuan;
        this.amount = pengajuan.price * pengajuan.qty;
        this.acc = false;
        this.accNote = "";
    }
    public void update() {
        this.amount = pengajuan.price * pengajuan.qty;
        this.accNote = "";
    }
    public void accept(User accUser) {
        if (accUser.jabatan.equalsIgnoreCase("finance")) {
            this.acc = true;
            this.accUser = accUser;
        } else {
            System.out.println("Jabatan penyetuju tidak sesuai !");
        }
    }
    public void decline(User accUser, String accNote) {
        if (accUser.jabatan.equalsIgnoreCase("finance")) {
            this.acc = false;
            this.accUser = accUser;
            this.accNote = accNote;
        } else {
            System.out.println("Jabatan penyetuju tidak sesuai !");
        }
    }
    public void info() {
        System.out.println("No Anggaran : " + this.no);
        System.out.println("User : " + this.user.name);
        System.out.println("Tanggal : " + this.date);
        System.out.println("Subyek : " + this.pengajuan.subject);
        System.out.println("Harga : " + this.pengajuan.price);
        System.out.println("Banyaknya : " + this.pengajuan.qty);
        System.out.println("Total : " + this.amount);
        System.out.println("Disetujui : " + (this.acc == true ? "Ya" : (this.accNote.isEmpty() ? "Belum" : "Tidak")));
        if (this.acc == true || !this.accNote.isEmpty()) {
            System.out.println("Penyetuju : " + this.accUser.name);
        }
        if (!this.accNote.isEmpty()) {
            System.out.println("Catatan Persetujuan : " + this.accNote);
        }
    }
}
