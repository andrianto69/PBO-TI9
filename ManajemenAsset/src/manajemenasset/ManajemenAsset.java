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
        Pengajuan aju1 = new Pengajuan(user1, "Macbook 512GB Grey", "Untuk Manajemen", 25000, 3);
        System.out.println("\n> Membuat Pengajuan 1");
        aju1.info();
        
        // Menolak Pengajuan
        aju1.decline(user2, "Kemahalan mas.");
        System.out.println("\n> Menolak Pengajuan 1");
        aju1.info();
        
        // Merubah pengajuan 
        aju1.update("Macbook 256 Grey", "Untuk Manajemen", 20000, 3);
        System.out.println("\n> Merubah Pengajuan 1");
        aju1.info();
        
        // Menerima pengajuan dengan user yang salah
        System.out.println("\n> Terima Pengajuan 1, user salah");
        aju1.accept(user1);
        
        // Menerima pengajuan dengan user yang tepat
        System.out.println("\n> Terima Pengajuan 1, user tepat");
        aju1.accept(user2);
        aju1.info();
    }
}
