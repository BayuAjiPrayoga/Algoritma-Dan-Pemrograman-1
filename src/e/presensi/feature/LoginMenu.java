package e.presensi.feature;
import resources.Style;
import java.util.Scanner;
public class LoginMenu {
    static Scanner scanner = new Scanner(System.in);
    
    public static void loginGuru() {
        System.out.println("");
        System.out.println("+==========================================+");
              Style.showln("|-----------> E-PRESENSI Login <-----------|", Style.CYAN, Style.BOLD);
        System.out.println("+==========================================+");
        System.out.println("|                                          |");
        System.out.println("|       < Silahkan isi untuk Login >       |");
        System.out.println("|                                          |");
        System.out.println("+==========================================+");
        System.out.println("|              Informasi Login             |");
        System.out.println("+==========================================+");
        System.out.print("| Username: ");
        String username = scanner.next();
        System.out.print("| Password: ");
        String password = scanner.next();
        System.out.println("+==========================================+");
        System.out.println("|               Logging in...              |");
        System.out.println("+==========================================+");
        System.out.println("");
        System.out.println("<--------------> E-PRESENSI <-------------->");
        System.out.println("");
        
        if ("Admin".equals(username) && "guru456".equals(password)) {
                  Style.showln("           >>> Login berhasil! <<<" , Style.GREEN, Style.BOLD);
                  Style.showln("     Selamat, Anda telah berhasil login.\n    Selamat menggunakan sistem e-presensi." , Style.GREEN, Style.BOLD);
            System.out.println("");
            System.out.println("<--------------> E-PRESENSI <-------------->");
            System.out.println("");
            Menu.menuGuru();
        } else { 
            System.out.println("");
            System.out.println("+------------------------------------------+");
                  Style.showln("|            >>> Login gagal! <<<          |" , Style.RED, Style.BOLD);
                  Style.showln("|                                          |", Style.RED, Style.BOLD);
                  Style.showln("|       Oops! Sepertinya ada yang salah,   |", Style.RED, Style.BOLD);
                  Style.showln("|               Ayo coba lagi!             |", Style.RED, Style.BOLD);
                  Style.showln("|                                          |", Style.RED, Style.BOLD);
            System.out.println("<--------------> E-PRESENSI <-------------->");
            System.out.println("");
            loginGuru();
        }
        
    }
   
    
    public static void loginSekretaris() {
         System.out.println("");
        System.out.println("+==========================================+");
              Style.showln("|-----------> E-PRESENSI Login <-----------|", Style.CYAN, Style.BOLD);
        System.out.println("+==========================================+");
        System.out.println("|                                          |");
        System.out.println("|       < Silahkan isi untuk Login >       |");
        System.out.println("|                                          |");
        System.out.println("+==========================================+");
        System.out.println("|              Informasi Login             |");
        System.out.println("+==========================================+");
        System.out.print("| Username: ");
        String username = scanner.next();
        System.out.print("| Password: ");
        String password = scanner.next();
        System.out.println("+==========================================+");
        System.out.println("|               Logging in...              |");
        System.out.println("+==========================================+");
        System.out.println("");
        System.out.println("<--------------> E-PRESENSI <-------------->");
        System.out.println("");
        
        if ("Admin".equals(username) && "sekre123".equals(password)) {
                  Style.showln("           >>> Login berhasil! <<<" , Style.GREEN, Style.BOLD);
                  Style.showln("     Selamat, Anda telah berhasil login.\n    Selamat menggunakan sistem e-presensi." , Style.GREEN, Style.BOLD);
            System.out.println("");
            System.out.println("<--------------> E-PRESENSI <-------------->");
            System.out.println("");
            Menu.menuSekretaris();
        } else { 
             System.out.println("");
            System.out.println("+------------------------------------------+");
                  Style.showln("|            >>> Login gagal! <<<          |" , Style.RED, Style.BOLD);
                  Style.showln("|                                          |", Style.RED, Style.BOLD);
                  Style.showln("|       Oops! Sepertinya ada yang salah,   |", Style.RED, Style.BOLD);
                  Style.showln("|               Ayo coba lagi!             |", Style.RED, Style.BOLD);
                  Style.showln("|                                          |", Style.RED, Style.BOLD);
            System.out.println("<--------------> E-PRESENSI <-------------->");
            System.out.println("");
            loginSekretaris();
        }
        
    }
}
