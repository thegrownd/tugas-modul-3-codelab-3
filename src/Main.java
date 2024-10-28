/* Ini adalah javadoc untuk tugas memakai

inline, constant, Field, method dan encapsulation

pada variable DISKON itu dijadikan constant
pada variable hitungDiskon itu dijadikan dijadikan field
pada method TipeData harga itu di encapsulate
*/

class HitungDiskonPajak {

    public static final double DISKON = 0.1;
    private static double hitungDiskon;

    public static class TipeData {
        private double harga;

        TipeData(double harga) {
            this.setHarga(harga);
        }

        public double getHarga() {
            return harga;
        }

        public void setHarga(double harga) {
            this.harga = harga;
        }
    }

    public static void main(String[] args) {

        TipeData tipe = new TipeData(100);

        hitungDiskon = tipe.getHarga() * DISKON;

        double hasilDiskon = tipe.getHarga() - hitungDiskon;

        double hitungPajak = getHitungPajak(hasilDiskon);

        double total = hasilDiskon + hitungPajak;

        System.out.println("Total harga setelah diskon dan pajak: " + total);
    }

    private static double getHitungPajak(double hasilDiskon) {
        double hitungPajak = hasilDiskon * 0.05;
        return hitungPajak;
    }
}
