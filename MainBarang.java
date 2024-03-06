import java.util.Scanner;

public class MainBarang {
    TransaksiBarang transaksi = new TransaksiBarang();

    public MainBarang() {
        initBarang();
    }

    public void initBarang() {
        Barang barang1 = new Barang("K01", "Sabun", 1000, 5);
        Barang barang2 = new Barang("K02", "Pasta Gigi", 2000, 10);
        Barang barang3 = new Barang("K03", "Biore", 3000, 23);
        Barang barang4 = new Barang("K04", "Shampoo", 4000, 55);
        Barang barang5 = new Barang("K05", "Sikat Gigi", 5000, 65);

        transaksi.tambahBarang(barang1);
        transaksi.tambahBarang(barang2);
        transaksi.tambahBarang(barang3);
        transaksi.tambahBarang(barang4);
        transaksi.tambahBarang(barang5);
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==================================");
            System.out.println("      TOKO MAJU MUNDUR CANTIK     ");
            System.out.println("==================================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");

            System.out.print("Pilih [1-4]: ");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    transaksi.tampilkanBarang();
                    break;
                case "2":
                    while (true) {
                        System.out.print("Masukkan kode barang: ");
                        String kodeBarang = sc.nextLine();
                        transaksi.beliBarang(kodeBarang);

                        System.out.print("Apakah akan belanja kembali (Y/N)? ");
                        String tambahLagi = sc.nextLine();
                        if (!tambahLagi.equalsIgnoreCase("Y")) {
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("==========================");
                    System.out.println("Daftar pembelian");
                    System.out.println("==========================");
                    System.out.print("Masukkan kode barang: ");
                    String kodeBarang = sc.nextLine();
                    transaksi.tampilkanBarangPembelian(kodeBarang);
                    break;
                case "4":
                    System.out.println("Terima kasih telah berbelanja di toko kami");
                    System.exit(0); 
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void main(String[] args) {
        MainBarang main = new MainBarang();
        main.menu();
    }
}
