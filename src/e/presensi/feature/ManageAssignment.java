package e.presensi.feature;

import java.util.Scanner;
import resources.Style;
import e.presensi.model.ClassAssignment;
import e.presensi.model.StudentClass;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManageAssignment {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<ClassAssignment> data = new ArrayList<>();
    LocalDateTime ts = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDateTime = ts.format(dateTimeFormatter);
   static int pilihan;
   
    public void TugasKelas(ClassAssignment ca) {
        scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("+-------------------------------------------+");
              Style.showln("|------------> Tugas Pengganti <------------|",Style.CYAN, Style.BOLD);
        System.out.println("+-------------------------------------------+");
        System.out.println("");
        System.out.println("Masukkan judul tugas : ");
        ca.judulTugas = scanner.nextLine();
        System.out.println("");
        System.out.println("+------------------------------------------+");
              Style.show("Judul "+ ca.judulTugas + " Telah di tambahkan.",Style.GREEN);
        System.out.println("");
        System.out.println("+------------------------------------------+");
        
        System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");
        System.out.format("| No  |  Kelas   |  Hari   |    Pelajaran     |            Judul Tugas            |%n");
        System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");
        String tbl = "| %-3s | %-8s | %-7s | %-16s | %-33s |%n";



       
        this.data.add(ca);
        int index = 1;
        for (ClassAssignment data : data) {
            System.out.format(tbl, 
                    index++ ,data.className, data.hari,data.pelajaran,data.judulTugas);
        }
       

             System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");
//    scanner.next();
    System.out.println("Ketik 0 untuk kembali : ");
    pilihan = scanner.nextInt();
        
        switch(pilihan) {
            case 0 :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Menu.tugasKelasPengganti();
                break;
            default :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                TugasKelas(ca);
                break;
        }
        
            scanner.close();
    }
    
    public void cekTugasKelasPengganti(StudentClass ca){
         scanner = new Scanner(System.in);
         System.out.println("");
        System.out.println("Tugas Pada tanggal :" + formattedDateTime);
        System.out.println("");
        System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");
        System.out.format("| No  |  Kelas   |  Hari   |    Pelajaran     |            Judul Tugas            |%n");
        System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");
        String tbl = "| %-3s | %-8s | %-7s | %-16s | %-30s |%n";
       
        int index = 1;
        for (ClassAssignment data : data) {
            if(ca.className.equals(data.className)){
                System.out.format(tbl, 
                        (index++) ,data.className,data.hari,data.pelajaran,data.judulTugas);
            }
        }
       
        
        System.out.format("+-----+----------+---------+------------------+-----------------------------------+%n");

    System.out.println("Ketik 0 untuk kembali : ");
    pilihan = scanner.nextInt();
        
        switch(pilihan) {
            case 0 :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Menu.cekTugasPengganti();
                break;
            default :
                Menu.cekTugasPengganti();
                break;
    }
        scanner.close();
  } 
    
}
