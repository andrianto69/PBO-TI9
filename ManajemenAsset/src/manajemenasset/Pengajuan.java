package manajemenasset;

import java.util.Date;
import java.util.Random;

public class Pengajuan {
    private int no;
    public User user;
    public Date date;
    public String subject;
    public String desc;
    public double price;
    public int qty;
    public Boolean acc;
    public String accNote;
    public User accUser;

    public Pengajuan(User user, String subject, String desc, double price, int qty) {
        this.no = new Random().nextInt(1000);
        this.user = user;
        this.date = new Date();
        this.subject = subject;
        this.desc = desc;
        this.price = price;
        this.qty = qty;
        this.acc = false;
        this.accNote = "";
    }
    
    public void update(String subject, String desc, double price, int qty) {
        this.subject = subject;
        this.desc = desc;
        this.price = price;
        this.qty = qty;
        this.accNote = "";
    }
    public void accept(User accUser) {
        if (accUser.jabatan.equalsIgnoreCase("manager")) {
            this.acc = true;
            this.accUser = accUser;
        } else {
            System.out.println("Jabatan verifikator tidak sesuai !");
        }
    }
    public void decline(User accUser, String accNote) {
        if (accUser.jabatan.equalsIgnoreCase("manager")) {
            this.acc = false;
            this.accUser = accUser;
            this.accNote = accNote;
        } else {
            System.out.println("Jabatan verifikator tidak sesuai !");
        }
    }
    public void info() {
        System.out.println("No : " + this.no);
        System.out.println("User : " + this.user.name);
        System.out.println("Tanggal : " + this.date);
        System.out.println("Subyek : " + this.subject);
        System.out.println("Deskripsi : " + this.desc);
        System.out.println("Harga : " + this.price);
        System.out.println("Banyaknya : " + this.qty);
        System.out.println("Terverifikasi : " + (this.acc == true ? "Ya" : (this.accNote.isEmpty() ? "Belum" : "Tidak")));
        if (this.acc == true || !this.accNote.isEmpty()) {
            System.out.println("Verifikator : " + this.accUser.name);
        }
        if (!this.accNote.isEmpty()) {
            System.out.println("Catatan Verifikasi : " + this.accNote);
        }
    }
}
