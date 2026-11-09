package lt.vcd.homework6;

import java.io.File;
import java.util.Scanner;

public class task4 {
    public static long katalogoDydis(String katalogas) {
        File f = new File(katalogas);
        String[] falai = f.list();
        long suma = 0;

        if (falai == null) {
            System.out.println("Nepavyko perskaityti: " + katalogas);
            return 0;
        }
        for (int i = 0; i < falai.length; i++) {
            File tmp = new File(f, falai[i]);

            if (tmp.isDirectory()) {
                suma += katalogoDydis(tmp.getAbsolutePath());
            } else if (tmp.isFile()) {
                suma += tmp.length();
            }
        }
        System.out.println("Katalogas: " + f.getAbsolutePath());
        spausdintiDydi(suma);
        System.out.println();

        return suma;
    }

    public static void spausdintiDydi(long baitais) {
        double kb = baitais / 1024.0;
        double mb = baitais / (1024.0 * 1024.0);

        System.out.printf("MB: %.2f%n", mb);
        System.out.printf("KB: %.2f%n", kb);
        System.out.println("Baitais: " + baitais);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite katalogo kelia: ");
        String katalogas = sc.nextLine();

        File f = new File(katalogas);

        if (!f.exists()) {
            System.out.println("Klaida: sis katalogas neegzistuoja ");
        } else if (!f.isDirectory()) {
            System.out.println("Klaida: nurodytas failas, o ne katalogas ");
        } else {
            katalogoDydis(katalogas);
        }
    }
}
