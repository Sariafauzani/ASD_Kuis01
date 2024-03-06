import java.util.ArrayList;
class TransaksiBarang {
    ArrayList<Barang> barangs = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("===============================");
        System.out.println("Daftar Barang");
        System.out.println("===============================");
        for (Barang barang : barangs) {
            System.out.println("Kode: " + barang.kode + ", Nama: " + barang.nama + ", Harga: "
            + barang.harga + ", Stok: " + barang.stok);
        }
    }

    public void tampilkanBarangPembelian(String kodeBarang) {
        for (Barang barang : barangs) {
            if (barang.kode.equals(kodeBarang)) {
                System.out.println("Barang yang dibeli: " + barang.nama + ", Harga: " +
                 barang.harga);
                return;
            }
        }
        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
    }

    public void beliBarang(String kodeBarang) {
        for (Barang barang : barangs) {
            if (barang.kode.equals(kodeBarang)) {
                if (barang.stok > 0) {
                    barang.stok--;
                    System.out.println("Pembelian berhasil!!");
                } else {
                    System.out.println("Maaf, stok barang habis.");
                }
                return;
            }
        }
        System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan.");
    }
}