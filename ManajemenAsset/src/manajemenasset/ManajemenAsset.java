package manajemenasset;
public class ManajemenAsset {
    public static void main(String[] args) {
        // User
        User user1 = new User("wahid", "staff");
        User user2 = new User("anggoro", "manager");
        User user3 = new User("syaiful", "finance");
        System.out.println("\n> Profile User 1");
        user1.getProfile();
        System.out.println("\n> Profile User 2");
        user2.getProfile();
        System.out.println("\n> Profile User 3");
        user3.getProfile();
        System.out.println("=================");
        
        // = Membuat pengajuan =
        System.out.println("\n> Membuat Pengajuan 1");
        Pengajuan aju1 = new Pengajuan(user1, "Macbook 512GB Grey", "Untuk Manajemen", 25000, 3);
        aju1.info();
        
        // Menolak Pengajuan
        System.out.println("\n> Menolak Pengajuan 1");
        aju1.decline(user2, "Kemahalan mas.");
        aju1.info();
        
        // Merubah pengajuan 
        System.out.println("\n> Merubah Pengajuan 1");
        aju1.update("Macbook 256 Grey", "Untuk Manajemen", 20000, 3);
        aju1.info();
        
        // Menerima pengajuan dengan user yang salah
        System.out.println("\n> Terima Pengajuan 1, user salah");
        Anggaran dana1 = aju1.accept(user1);
        
        // Menerima pengajuan dengan user yang tepat
        System.out.println("\n> Terima Pengajuan 1, user tepat");
        Anggaran dana2 = aju1.accept(user2);
        aju1.info();

        System.out.println("\n> Objek anggaran dari penerimaan pengajuan, user salah");
        System.out.println(dana1);
        
        System.out.println("\n> Objek anggaran dari penerimaan pengajuan, user tepat");
        System.out.println(dana2);
        
        System.out.println("\n> Info anggaran dari penerimaan pengajuan, user tepat");
        dana2.info();
        
        // Menolak anggaran dengan user yang salah
        System.out.println("\n> Tolak Anggaran 2, user salah");
        dana2.decline(user2, "Beli 2 saja");
        
        // Menolak anggaran dengan user yang tepat
        System.out.println("\n> Tolak Anggaran 2, user tepat");
        dana2.decline(user3, "Beli 2 saja");
        dana2.info();
        
        // Merubah pengajuan untuk anggran2
        System.out.println("\n> Merubah Pengajuan 1 untuk Anggaran 2");
        aju1.update("Macbook 256 Grey", "Untuk Manajemen", 20000, 2);
        System.out.println("- Info Pengajuan 1 -");
        aju1.info();
        System.out.println("- Info Anggaran 2 -");
        dana2.info();
        
        // Menerima anggaran
        System.out.println("\n> Terima Anggaran 2");
        dana2.accept(user3);
        dana2.info();
    }
}
