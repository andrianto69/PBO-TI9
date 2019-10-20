package manajemenasset;

import java.util.Random;

public class User {
    private int id;
    public String name;
    public String jabatan;

    public User(String name, String jabatan) {
        this.id = new Random().nextInt(1000);
        this.name = name;
        this.jabatan = jabatan;
    }
    
    public void getProfile() {
        System.out.println("ID : " + this.id);
        System.out.println("Nama : " + this.name);
        System.out.println("Jabatan : " + this.jabatan);
    }
    
    public void setProfile(String name, String jabatan) {
        this.name = name;
        this.jabatan = jabatan;
    }
}
