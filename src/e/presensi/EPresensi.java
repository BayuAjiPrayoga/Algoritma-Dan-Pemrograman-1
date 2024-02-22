package e.presensi;

import java.util.Scanner;
import resources.Style;
import e.presensi.feature.LoginMenu;
import e.presensi.feature.Menu;

public class EPresensi {    
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuAwal();
    }
    
    public static void menuAwal() {
    int pilihan;
   
    System.out.println("+==========================================+");
          Style.showln("|--------------> E-PRESENSI <--------------|", Style.CYAN, Style.BOLD);
    System.out.println("+==========================================+");
          Style.showln("|                                          |");
    System.out.println("|       Selamat Datang di E-Presensi,      |");
    System.out.println("|      Pilih opsi login di bawah untuk     |");
          Style.showln("|           memulai presensi Anda          |");
          Style.showln("|                                          |");
    System.out.println("+------------------------------------------+");
    System.out.println("|  1. Login Sebagai Guru                   |");
    System.out.println("|  2. Login Sebagai Sekretaris Kelas       |");
    System.out.println("+------------------------------------------+");
    System.out.println("|  3. Bantuan                              |");
    System.out.println("|  0. Exit                                 |");
    System.out.println("+------------------------------------------+");
      System.out.print(" > Pilihan Anda: ");
    pilihan = scanner.nextInt();
    System.out.println("+------------------------------------------+");
    System.out.println("");

    switch (pilihan) {
        case 1:
            LoginMenu.loginGuru();
            break;
        case 2:
            LoginMenu.loginSekretaris();
            break;
        case 3 :
            Menu.menuBantuan();
            break;
        case 0:
            System.out.println("+------------------------------------------+");
                  Style.showln("|   Terima kasih sudah memakai E-Presensi, |", Style.GREEN);
                  Style.showln("|di mana kehadiran bertemu dengan kemudahan|", Style.GREEN);
            System.out.println("<-------------- E-PRESENSI ---------------->");
            break;
        default:
    System.out.println("+------------------------------------------+");
          Style.showln("| Oops! Sepertinya pilihan yang Anda buat  |", Style.RED, Style.BOLD);
          Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
    System.out.println("<-------------- E-PRESENSI ---------------->");
    System.out.println("");
    menuAwal();
    break;
    }
}


} 

    
