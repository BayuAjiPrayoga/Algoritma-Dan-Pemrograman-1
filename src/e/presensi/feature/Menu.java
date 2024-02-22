package e.presensi.feature;

import resources.Style;
import java.util.Scanner;
import static e.presensi.EPresensi.menuAwal;
import e.presensi.model.ClassAssignment;
import e.presensi.model.StudentClass;
import resources.DataStudentClass;


public class Menu {
    
    static Scanner scanner = new Scanner(System.in);
    static int pilihan;
    static ManageStudent ms = new ManageStudent();
    static ManageAssignment ma = new ManageAssignment();
    static DataStudentClass dsc = new DataStudentClass();

    
//    GURU =========================================>
    public static void menuGuru() {
        
            System.out.println("");
            System.out.println("+===========================================+");
                  Style.showln("|---------------> Menu Guru <---------------|", Style.CYAN, Style.BOLD);
            System.out.println("+===========================================+");
                  Style.showln("| No |        Pilihan Menu Guru             |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Absensi Kelas                       |");
                  Style.showln("| 2  |  Rekapan Absensi                     |");
                  Style.showln("| 3  |  Tugas Kelas Pengganti               |");
                  Style.showln("| 4  |  Daftar Siswa                        |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Logout                              |");
            System.out.println("+-------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    AbsensiSiswa();
                    break;
                case 2 : 
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    RekapanAbsensi();
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    tugasKelasPengganti();
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    daftarSiswa();
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuAwal();
                    break;
                    
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                menuGuru();
                    break;
            }
    } 
        
//    Menu Guru bagian 1. Absensi Siswa ================================================>
     public static void AbsensiSiswa() {
         
            System.out.println("");
            System.out.println("+-------------------------------------------+");
                  Style.showln("|-------------> Absensi Siswa <-------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No |      Pilihan Absensi Siswa           |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Absensi Siswa Kelas 7               |");
                  Style.showln("| 2  |  Absensi Siswa Kelas 8A              |");
                  Style.showln("| 3  |  Absensi Siswa Kelas 8B              |");
                  Style.showln("| 4  |  Absensi Siswa Kelas 9               |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensi("7");
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensi("8A");
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensi("8B");
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensi("9");
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuGuru();
                    break;
                default :
                    System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                AbsensiSiswa();
                    break;
            }
    }
     
//     Menu Guru bagian 2.Rekapan Absensi ================================================>
     public static void RekapanAbsensi() {
         
         System.out.println("");
         System.out.println("+-------------------------------------------+");
               Style.showln("|-------------> Rekapan Absensi <-----------|", Style.CYAN, Style.BOLD);
         System.out.println("+-------------------------------------------+");
               Style.showln("| No |      Pilihan Rekapan Absensi         |", Style.YELLOW);
         System.out.println("+-------------------------------------------+");
               Style.showln("| 1  |  Kelas 7                             |");
               Style.showln("| 2  |  Kelas 8A                            |");
               Style.showln("| 3  |  Kelas 8B                            |");
               Style.showln("| 4  |  Kelas 9                             |");
         System.out.println("+-------------------------------------------+");
               Style.showln("| 0  |  Kembali                             |");
         System.out.println("+-------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
         System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensi("7");
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensi("8A");
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensi("8B");
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensi("9");
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuGuru();
                    break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                RekapanAbsensi();
                    break;
            }
     }
     
//     Menu Guru bagian 3. TUGAS KELAS PENGGANTI ================================================>
     public static void tugasKelasPengganti() {
        
         System.out.println("");
            System.out.println("+-------------------------------------------+");
                  Style.showln("|------------> Tugas Pengganti <------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No |     Pilihan Tugas Pengganti          |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Tugas Pengganti Kelas 7             |");
                  Style.showln("| 2  |  Tugas Pengganti Kelas 8A            |");
                  Style.showln("| 3  |  Tugas Pengganti Kelas 8B            |");
                  Style.showln("| 4  |  Tugas Pengganti Kelas 9             |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Day(dsc.class7 );
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Day(dsc.class8A);
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Day(dsc.class8B);
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                Day(dsc.class9);
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuGuru();
                    break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                tugasKelasPengganti();
                    break;
            }
     }
//     di dalam tugas kelas pengganti (Hari) ================================================>
      public static void Day(StudentClass classes) {
        
           ClassAssignment ca = new ClassAssignment();
           ca.className = classes.className;
          
            System.out.println("");
           System.out.println("+-------------------------------------------+");
                 Style.showln("|------------------> Hari <-----------------|", Style.CYAN, Style.BOLD);
           System.out.println("+-------------------------------------------+");
                 Style.showln("| No |           Pilihan Hari               |", Style.YELLOW);
           System.out.println("+-------------------------------------------+");
                 Style.showln("| 1  |  Senin                                |");
                 Style.showln("| 2  |  Selasa                               |");
                 Style.showln("| 3  |  Rabu                                 |");
                 Style.showln("| 4  |  Kamis                                |");
                 Style.showln("| 5  |  Jum'at                               |");
                 Style.showln("| 6  |  Sabtu                                |");
           System.out.println("+-------------------------------------------+");
                 Style.showln("| 0  |  Kembali                              |");
           System.out.println("+-------------------------------------------+");
             System.out.print(" > Pilihan Anda: ");
           System.out.println("+-------------------------------------------+");
            pilihan = scanner.nextInt();
            switch(pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                ca.hari = "senin";
                    Pelajaran(classes.senin, ca, classes);
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ca.hari = "selasa";
                    Pelajaran(classes.selasa, ca, classes);
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ca.hari = "rabu";
                    Pelajaran(classes.rabu, ca, classes);
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ca.hari = "kamis";
                    Pelajaran(classes.kamis, ca, classes);
                    break;
                case 5 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ca.hari = "jumat";
                    Pelajaran(classes.jumat, ca, classes);
                    break;
                case 6 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ca.hari = "sabtu";
                    Pelajaran(classes.sabtu, ca, classes);
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    tugasKelasPengganti();
                    break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                    Day(classes);
                    break;
            }
    }

//   di dalam tugas kelas pengganti  (Pelajaran) ================================================>
    public static void Pelajaran(String[] day, ClassAssignment ca, StudentClass classes) {
        System.out.println("");
        System.out.println("+-------------------------------------------+");
              Style.showln("|-------------> Mata Pelajaran <------------|", Style.CYAN, Style.BOLD);
        System.out.println("+-------------------------------------------+");
              Style.showln("| No |      Pilihan Mata Pelajaran          |", Style.YELLOW);
        System.out.println("+-------------------------------------------+");

        int indexPelajaran = 1;
        for (String pelajaran : day) {                                  
              Style.showln("| " + (indexPelajaran++) + "  |  " + pelajaran);
        }

        System.out.println("+-------------------------------------------+");
              Style.showln("| 0  |  Kembali                             |");
        System.out.println("+-------------------------------------------+");
        System.out.print(" > Pilihan Anda: ");
        pilihan = scanner.nextInt();
        System.out.println("+-------------------------------------------+");

        if (pilihan >= 1 && pilihan <= day.length) {
            ca.pelajaran = day[pilihan - 1];
            System.out.println("");
            System.out.println("Anda memilih Pelajaran " + ca.pelajaran);
            System.out.println("");
            System.out.println("<--------------> E-PRESENSI <-------------->");
            System.out.println("");
            ma.TugasKelas(ca);

        } else if (pilihan == 0) {
            Day(classes);
        } else {
            System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
            Pelajaran(day, ca, classes);
        }

        
    }
    
//    Menu Guru bagian 4. DAFTAR SISWA ================================================>
    public static void daftarSiswa() {
            System.out.println("");
            System.out.println("+-------------------------------------------+");
                  Style.showln("|-------------> Daftar Siswa <--------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No |      Pilihan Daftar Siswa            |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Daftar Siswa Kelas 7                |");
                  Style.showln("| 2  |  Daftar Siswa Kelas 8A               |");
                  Style.showln("| 3  |  Daftar Siswa Kelas 8B               |");
                  Style.showln("| 4  |  Daftar Siswa Kelas 9                |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
              System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.listOfStudents("7");
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.listOfStudents("8A");
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.listOfStudents("8B");
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.listOfStudents("9");
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuGuru();
                    break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                    daftarSiswa();
                    break;
            }
    }

//   ================================================> ================================================> ================================================>    
    
//    SEKRETARIS =========================================>
    public static void menuSekretaris() {
            System.out.println("");
           System.out.println("+==========================================+");
                 Style.showln("|------------> Menu Sekretaris <-----------|", Style.CYAN, Style.BOLD);
           System.out.println("+==========================================+");
                 Style.showln("| No |     Pilihan Menu Sekretaris         |", Style.YELLOW);
           System.out.println("+------------------------------------------+");
                 Style.showln("| 1  |  Absensi Kelas                      |");
                 Style.showln("| 2  |  Rekapan Absensi                    |");
                 Style.showln("| 3  |  Cek Tugas Kelas                    |");
                 Style.showln("| 4  |  Jadwal Pelajaran                   |");
           System.out.println("+------------------------------------------+");
                 Style.showln("| 0  |  Logout                             |");
           System.out.println("+------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    sekreAbsensiSiswa();
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    sekreRekapanAbsensi();
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                   cekTugasPengganti();
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                   jadwalPelajaran();
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuAwal();
                    break;
                
                default :
                   System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                menuSekretaris();
                    break;
            }
    }
    
//    menu sekre 1 absensi ================================================>
    public static void sekreAbsensiSiswa() {
            System.out.println("");
            System.out.println("+-------------------------------------------+");
                  Style.showln("|-------------> Absensi Siswa <-------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No |      Pilihan Absensi Siswa           |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Siswa Kelas 7                       |");
                  Style.showln("| 2  |  Siswa Kelas 8A                      |");
                  Style.showln("| 3  |  Siswa Kelas 8B                      |");
                  Style.showln("| 4  |  Siswa Kelas 9                       |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
              System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensiSekre("7");
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensiSekre("8A");
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensiSekre("8B");
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.absensiSekre("9");
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuSekretaris();
                    break;
                     default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                sekreAbsensiSiswa();
                break;
            }
    }
//     end absensi ================================================>
     
//     Menu Guru bagian 2.Rekapan Absensi ================================================>
     public static void sekreRekapanAbsensi() {
         System.out.println("");
          System.out.println("+-------------------------------------------+");
                Style.showln("|-------------> Rekapan Absensi <-----------|", Style.CYAN, Style.BOLD);
          System.out.println("+-------------------------------------------+");
                Style.showln("| No |      Pilihan Rekapan Absensi         |", Style.YELLOW);
          System.out.println("+-------------------------------------------+");
                Style.showln("| 1  |  Kelas 7                             |");
                Style.showln("| 2  |  Kelas 8A                            |");
                Style.showln("| 3  |  Kelas 8B                            |");
                Style.showln("| 4  |  Kelas 9                             |");
          System.out.println("+-------------------------------------------+");
                Style.showln("| 0  |  Kembali                             |");
          System.out.println("+-------------------------------------------+");
            System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
          System.out.println("+------------------------------------------+");
             
            switch (pilihan) {
                case 1 :
                    
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensiSekre("7");
                    break;
                case 2 :
                   
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensiSekre("8A");
                    break;
                case 3 :
                   
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensiSekre("8B");
                    break;
                case 4 :
                   
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.rekapAbsensiSekre("9");
                    break;
                case 0 :
                   
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuSekretaris();
                    break;
                     default :
                  System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                sekreRekapanAbsensi();
                break;
            }
     }        
//   end rekpan ================================================>
     
//      menu sekretaris bagian 3. cek tugas kelas ================================================>
    public static void cekTugasPengganti() {
        System.out.println("");
            System.out.println("+-------------------------------------------+");
                  Style.showln("|------------> Cek Tugas Kelas <------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No |        Pilihan Cek Tugas             |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Tugas Kelas 7                       |");
                  Style.showln("| 2  |  Tugas Kelas 8A                      |");
                  Style.showln("| 3  |  Tugas Kelas 8B                      |");
                  Style.showln("| 4  |  Tugas Kelas 9                       |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
              System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
          
            
           switch (pilihan) {
                case 1 :
                    System.out.println("");
                    Style.showln("Anda memilih Kelas 7", Style.GREEN);
                    System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                ma.cekTugasKelasPengganti(dsc.class7 );
                    break;
                case 2 :
                  
                    System.out.println("");
                    Style.showln("Anda memilih Kelas 8A", Style.GREEN);
                    System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                ma.cekTugasKelasPengganti(dsc.class8A);
                    break;
                case 3 :
                   
                    System.out.println("");
                    Style.showln("Anda memilih Kelas 8B", Style.GREEN);
                    System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                ma.cekTugasKelasPengganti(dsc.class8B);
                    break;
                case 4 :
                    
                    System.out.println("");
                    Style.showln("Anda memilih Kelas 9", Style.GREEN);
                    System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                ma.cekTugasKelasPengganti(dsc.class9);
                    break;
                case 0 :
                    System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuSekretaris();
                    break;
                     default :
                   System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                cekTugasPengganti();
                break;
            }
    }
//      end cek tugas kelas   ================================================>
    
//      menu sekretaris bagian 4. jadwal pelajaran ================================================>
    public static void jadwalPelajaran() {
            System.out.println("+-------------------------------------------+");
                  Style.showln("|------------> Jadwal Pelajaran <-----------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| No.|          Pilihan Jadwal              |", Style.YELLOW);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Jadwal Kelas 7                      |");
                  Style.showln("| 2  |  Jadwal Kelas 8A                     |");
                  Style.showln("| 3  |  Jadwal Kelas 8B                     |");
                  Style.showln("| 4  |  Jadwal Kelas 9                      |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
              System.out.print(" > Pilihan Anda: ");
            pilihan = scanner.nextInt();
            System.out.println("+-------------------------------------------+");
            
            switch (pilihan) {
                case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.scheduleClass("7");
                    break;
                case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.scheduleClass("8A");
                    break;
                case 3 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.scheduleClass("8B");
                    break;
                case 4 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    ms.scheduleClass("9");
                    break;
                case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuSekretaris();
                    break;
                     default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                jadwalPelajaran();
                break;
            }
    }
//      end jadwal ================================================>

            
//            MENU BANTUAN

public static void menuBantuan() {
            System.out.println("+-------------------------------------------+");
                  Style.showln("|--------------> Menu Bantuan <-------------|", Style.CYAN, Style.BOLD);
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 1  |  Petunjuk Login                      |");
                  Style.showln("| 2  |  Petunjuk Menu Guru                  |");
                  Style.showln("| 3  |  Petunjuk Menu Sekretaris            |");
            System.out.println("+-------------------------------------------+");
                  Style.showln("| 0  |  Kembali                             |");
            System.out.println("+-------------------------------------------+");
              System.out.print(" > Pilihan Anda: ");
        pilihan = scanner.nextInt();
        
        switch(pilihan) {
            case 1 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                pLogin();
                break;
            case 2 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                pGuru();
                break;
            case 3: 
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                pSekre();
                break;
             case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    menuAwal();
                    break;
                     default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                menuBantuan();
                break;
        }
    }

    public static void pLogin(){
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("|                              Petunjuk Login - E-PRESENSI                               |");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("|    1    |    Petunjuk Login                                                            |");
        System.out.println("|         |     - Pilih opsi menu login sebagai guru atau sekretaris kelas               |");
        System.out.println("|         |     - Masukkan username dan sandi yang diberikan oleh operator sekolah       |");
        System.out.println("|         |     - Setelah login, akan diarahkan pada menu Guru atau Sekretaris           |");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("Ketik 0 untuk kembali :");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuBantuan();
                break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                pLogin();
                break;
        }
    }
    public static void pGuru(){
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|                            Petunjuk Menu Guru - E-PRESENSI                               |");
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("|    2    |    Menu Guru                                                                   |");
        System.out.println("|         |    - Absensi kelas                                                             |");
        System.out.println("|         |      - Pilih kelas yang akan diabsen dan input keterangan hadir/izin/sakit/alfa|");
        System.out.println("|         |      - Tabel rekapan absen selama 1 hari akan muncul                           |");
        System.out.println("|         |    - Rekapan Absensi                                                           |");
        System.out.println("|         |      - Pilih kelas untuk melihat rekapan absensi                               |");
        System.out.println("|         |    - Tugas kelas pengganti                                                     |");
        System.out.println("|         |      - Berikan tugas pengganti, pilih hari, dan mata pelajaran                 |");
        System.out.println("|         |      - Daftar tugas akan muncul pada menu sekretaris kelas                     |");
        System.out.println("|         |    - Daftar Siswa                                                              |");
        System.out.println("|         |      - Lihat daftar siswa dari berbagai kelas                                  |");
        System.out.println("|         |    - Logout                                                                    |");
        System.out.println("|         |      - Kembali ke tampilan awal (Login)                                        |");
        System.out.println("+------------------------------------------------------------------------------------------+");
        System.out.println("Ketik 0 untuk kembali :");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuBantuan();
                break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                pGuru();
                break;
        }
    }
    public static void pSekre(){
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("|                       Petunjuk Menu Sekretaris Kelas - E-PRESENSI                      |");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("|    3    |    Menu Sekretaris Kelas                                                     |");
        System.out.println("|         |    - Absensi kelas                                                           |");
        System.out.println("|         |      - Mengabsen teman sekelas untuk bukti absensi                           |");
        System.out.println("|         |    - Rekapan Absen                                                           |");
        System.out.println("|         |      - Melihat rekapan absensi yang telah diinputkan pada hari tersebut      |");
        System.out.println("|         |    - Cek kelas pengganti                                                     |");
        System.out.println("|         |      - Melihat tugas pengganti dari guru yang tidak masuk                    |");
        System.out.println("|         |    - Jadwal Pelajaran                                                        |");
        System.out.println("|         |      - Melihat jadwal pelajaran pada hari tersebut                           |");
        System.out.println("|         |    - Logout                                                                  |");
        System.out.println("|         |      - Kembali ke tampilan awal (Login)                                      |");
        System.out.println("+----------------------------------------------------------------------------------------+");
        System.out.println("Ketik 0 untuk kembali :");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case 0 :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                menuBantuan();
                break;
                default :
                System.out.println("");
                System.out.println("+------------------------------------------+");
                      Style.showln("| Oops! Sepertinya pilihan yang Anda pilih |", Style.RED, Style.BOLD);
                      Style.showln("| tidak ditemukan. Ayo coba lagi!          |", Style.RED, Style.BOLD);
                System.out.println("<-------------- E-PRESENSI ---------------->");
                System.out.println("");
                pSekre();
                break;
        }
    }
} 
            
            
    

  