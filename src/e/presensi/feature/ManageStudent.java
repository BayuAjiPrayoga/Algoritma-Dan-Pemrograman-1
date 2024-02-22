package e.presensi.feature;

import static e.presensi.feature.Menu.AbsensiSiswa;
import static e.presensi.feature.Menu.RekapanAbsensi;
import static e.presensi.feature.Menu.daftarSiswa;
import static e.presensi.feature.Menu.jadwalPelajaran;
import static e.presensi.feature.Menu.sekreAbsensiSiswa;
import static e.presensi.feature.Menu.sekreRekapanAbsensi;
import e.presensi.model.Siswa;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import resources.Style;
import java.util.Scanner;
import resources.DataStudentClass;
import resources.Students;


public class ManageStudent {
   static Scanner scanner = new Scanner(System.in);
   Siswa[] siswa = new Students().data;
    private int i;
    LocalDateTime ts = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDateTime = ts.format(dateTimeFormatter);
   
//   Menampilkan Daftar Siswa ================================================>
    public void listOfStudents(String classtype) {
        int i = 1;
        int pilihan;
        System.out.format("+-----+----------------------------+--------------------------------+------+%n");
        System.out.format("| No  | NISN / NIS                 | Nama Siswa                     | L/P  |%n");
        System.out.format("+-----+----------------------------+--------------------------------+------+%n");
        String tbl = "| %-3s | %-26s | %-30s | %-4s |%n";

        for (Siswa siswa : siswa) {
           if(siswa.classType == classtype)  {
            System.out.printf("| %-3s | %-26s | %-30s | %-4s |%n",
                    (i++), siswa.nisnNis(), siswa.name(), siswa.gender());
            }
        }
        
        System.out.format("+-----+----------------------------+--------------------------------+------+%n");
        System.out.print("Ketik 0 untuk Kembali ");
            pilihan = scanner.nextInt();
        switch (pilihan) {
            case 0 :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                daftarSiswa();
                break;
            default :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. Silahkan coba lagi.",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                listOfStudents(classtype);
                break;
        }
        
    } 
    
    
    public int getMaxStringLength(String[] arr) {
        int maxLength = 0;
        for (String str : arr) {
            maxLength = Math.max(maxLength, str.length());
        }
        return maxLength;
        }
//    ================================================>
    
    
//    menampilkan Jadwal Pelajaran setiap kelas ================================================>
    public void scheduleClass(String classType) {
        DataStudentClass dsc = new DataStudentClass();
            System.out.println("");
                if(classType == "7"){
                System.out.println("+------------------------------------------+");
                System.out.println("|         Jadwal Pelajaran Kelas 7         |");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Hari", "Pelajaran");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Senin", Arrays.toString(dsc.class7.senin));
                System.out.printf("| %-7s | %-30s |\n", "Selasa", Arrays.toString(dsc.class7.selasa));
                System.out.printf("| %-7s | %-30s |\n", "Rabu", Arrays.toString(dsc.class7.rabu));
                System.out.printf("| %-7s | %-30s |\n", "Kamis", Arrays.toString(dsc.class7.kamis));
                System.out.printf("| %-7s | %-30s |\n", "Jum'at", Arrays.toString(dsc.class7.jumat));
                System.out.printf("| %-7s | %-30s |\n", "Sabtu", Arrays.toString(dsc.class7.sabtu));
                System.out.println("+------------------------------------------+");


                }else if(classType == "8A"){
                System.out.println("+------------------------------------------+");
                System.out.println("|         Jadwal Pelajaran Kelas 8A        |");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Hari", "Pelajaran");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Senin", Arrays.toString(dsc.class8A.senin));
                System.out.printf("| %-7s | %-30s |\n", "Selasa", Arrays.toString(dsc.class8A.selasa));
                System.out.printf("| %-7s | %-30s |\n", "Rabu", Arrays.toString(dsc.class8A.rabu));
                System.out.printf("| %-7s | %-30s |\n", "Kamis", Arrays.toString(dsc.class8A.kamis));
                System.out.printf("| %-7s | %-30s |\n", "Jum'at", Arrays.toString(dsc.class8A.jumat));
                System.out.printf("| %-7s | %-30s |\n", "Sabtu", Arrays.toString(dsc.class8A.sabtu));
                System.out.println("+------------------------------------------+");
                
                
                }else if(classType == "8B"){
                System.out.println("+------------------------------------------+");
                System.out.println("|         Jadwal Pelajaran Kelas 8B        |");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Hari", "Pelajaran");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Senin", Arrays.toString(dsc.class8B.senin));
                System.out.printf("| %-7s | %-30s |\n", "Selasa", Arrays.toString(dsc.class8B.selasa));
                System.out.printf("| %-7s | %-30s |\n", "Rabu", Arrays.toString(dsc.class8B.rabu));
                System.out.printf("| %-7s | %-30s |\n", "Kamis", Arrays.toString(dsc.class8B.kamis));
                System.out.printf("| %-7s | %-30s |\n", "Jum'at", Arrays.toString(dsc.class8B.jumat));
                System.out.printf("| %-7s | %-30s |\n", "Sabtu", Arrays.toString(dsc.class8B.sabtu));
                System.out.println("+------------------------------------------+");
                
                
                }else if(classType == "9"){
                System.out.println("+------------------------------------------+");
                System.out.println("|         Jadwal Pelajaran Kelas 9         |");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Hari", "Pelajaran");
                System.out.println("+------------------------------------------+");
                System.out.printf("| %-7s | %-30s |\n", "Senin", Arrays.toString(dsc.class9.senin));
                System.out.printf("| %-7s | %-30s |\n", "Selasa", Arrays.toString(dsc.class9.selasa));
                System.out.printf("| %-7s | %-30s |\n", "Rabu", Arrays.toString(dsc.class9.rabu));
                System.out.printf("| %-7s | %-30s |\n", "Kamis", Arrays.toString(dsc.class9.kamis));
                System.out.printf("| %-7s | %-30s |\n", "Jum'at", Arrays.toString(dsc.class9.jumat));
                System.out.printf("| %-7s | %-30s |\n", "Sabtu", Arrays.toString(dsc.class9.sabtu));
                System.out.println("+------------------------------------------+");
            } else {
                Style.showln("Maaf opsi yang anda pilih tidak ada. ",Style.RED);
            }
            System.out.println("");
            System.out.println("+------------------------------------------+");
            System.out.print("Ketik 0 untuk kembali : ");
            int pilihan = scanner.nextInt();
            System.out.println("+------------------------------------------+");
            
            switch (pilihan) {
                case (0) :
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                    jadwalPelajaran();
                    break;
                
                default :
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. Silahkan coba lagi.",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                this.scheduleClass(classType);
                    break;
            }
    }
//    ================================================>
    
    
//    untuk absensi siswa GURU ================================================>
        public void absensi(String classtype) {
            int hadir = 0;
            int ijin = 0;
            int sakit = 0;
            int alpha = 0;
            int i=1;
            for (Siswa siswa : siswa) {
                if(siswa.classType == classtype)  {

                System.out.print("Kehadiran Siswa/i " + siswa.name() + ",\n(H/I/S/A): ");
                String status = scanner.next().toUpperCase();

                switch (status) {
                    case "H" :
                        siswa.setStatusKehadiran("Hadir");
                        hadir++;
                        break;
                    case "I" :
                        siswa.setStatusKehadiran("Ijin");
                        ijin++;
                        break;
                    case "S" :
                        siswa.setStatusKehadiran("Sakit");
                        sakit++;
                        break;
                    case "A" :
                        siswa.setStatusKehadiran("Alpha");
                        alpha++;
                        break;
                    default:
                        break;
                }
              }
            }

            System.out.println("");
        System.out.println("+------------------------------------------+");
                System.out.println("");
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.format("| No   | NISN / NIS                 | Nama Siswa                     | L/P  | Keterangan |%n");
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        String tbl = "| %-4s | %-26s | %-30s | %-3s  | %-10s |%n";
        
        for (Siswa siswa : siswa) {
           if(siswa.classType == classtype)  {
            System.out.printf("| %-4s | %-26s | %-30s | %-3s  | %-10s |%n",
                    (i++), siswa.nisnNis(), siswa.name(), siswa.gender(), siswa.statusKehadiran());
            }
        }

        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.println("");
        System.out.println("Keterangan : ");
        System.out.println("Hadir: " + hadir);
        System.out.println("Izin: " + ijin);
        System.out.println("Sakit: " + sakit);
        System.out.println("Alpha: " + alpha);
        System.out.println("");
        int pilihan;
        System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
        System.out.print("Ketik 0 untuk kembali : ");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case (0) :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                AbsensiSiswa();
                break;
            default :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. Silahkan coba lagi.",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                absensi(classtype);
                break;
        }
        
        scanner.close();
        
    } 
//    ================================================>
    
    
//    untuk merekap data absensi GURU ================================================>
    public void rekapAbsensi(String classtype) {
         int hadir = 0;
        int ijin = 0;
        int sakit = 0;
        int alpha = 0;
        
       int i=1;
            for (Siswa siswa : siswa) {
                if(siswa.classType == classtype)  {
            
            }
        }
            

    
        System.out.println("\nRekapan Absen Tanggal : " + formattedDateTime );
        System.out.format("+------+----------------------------+--------------------------------+------+-----------+%n");
        System.out.format("| No   | NISN / NIS                 | Nama Siswa                     | L/P  | Keterangan|%n");
        System.out.format("+------+----------------------------+--------------------------------+------+-----------+%n");
        String tbl = "| %-4s | %-26s | %-30s | %-3s  | %-10s |%n";
        
        for (Siswa siswa : siswa) {
           if(siswa.classType == classtype)  {
            System.out.printf("| %-4s | %-26s | %-30s | %-3s  | %-10s |%n",
                    (i++), siswa.nisnNis(), siswa.name(), siswa.gender(), siswa.statusKehadiran());
            
        }
            switch (siswa.statusKehadiran()) {
                    case "Hadir" :
                        hadir++;
                        break;
                    case "Ijin" :
                        ijin++;
                        break;
                    case "Sakit" :
                        sakit++;
                        break;
                    case "Alpha" :
                        alpha++;
                        break;
                    default :
                        break;
                }
        
       }

        System.out.format("+------+----------------------------+--------------------------------+------+-----------+%n");
        System.out.println("");
        System.out.println("Keterangan : ");
        System.out.println("Hadir: " + hadir);
        System.out.println("Izin: " + ijin);
        System.out.println("Sakit: " + sakit);
        System.out.println("Alpha: " + alpha);
        System.out.println("");
        int pilihan;
        System.out.println("+------------------------------------------+");
                System.out.println("");
        System.out.print("Ketik 0 untuk kembali : ");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case (0) :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                RekapanAbsensi();
                break;
            default:
                System.out.println("+------------------------------------------+");
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. ",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                rekapAbsensi(classtype);
                break;
        }
    }
    
//    untuk absensi siswa SEKRETARIS ================================================>
        public void absensiSekre(String classtype) {
            int hadir = 0;
            int ijin = 0;
            int sakit = 0;
            int alpha = 0;
            int i=1;
            for (Siswa siswa : siswa) {
                if(siswa.classType.equals(classtype))  {

                System.out.print("Kehadiran Siswa/i " + siswa.name() + ",\n(H/I/S/A): ");
                String status = scanner.next().toUpperCase();

                switch (status) {
                    case "H" :
                        siswa.setStatusKehadiran("Hadir");
                        hadir++;
                        break;
                    case "I" :
                        siswa.setStatusKehadiran("Ijin");
                        ijin++;
                        break;
                    case "S" :
                        siswa.setStatusKehadiran("Sakit");
                        sakit++;
                        break;
                    case "A" :
                        siswa.setStatusKehadiran("Alpha");
                        alpha++;
                        break;
                    default :
                        break;
                }
              }
            }

            System.out.println("");
        System.out.println("+------------------------------------------+");
                System.out.println("");
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.format("| No   | NISN / NIS                 | Nama Siswa                     | L/P  | Keterangan |%n");
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        String tbl = "| %-4s | %-26s | %-30s | %-3s  | %-10s |%n";
        
        for (Siswa siswa : siswa) {
           if(siswa.classType.equals(classtype))  {
            System.out.printf("| %-4s | %-26s | %-30s | %-3s  | %-10s |%n",
                    (i++), siswa.nisnNis(), siswa.name(), siswa.gender(), siswa.statusKehadiran());
            }
        }

        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.println("");
        System.out.println("Keterangan : ");
        System.out.println("Hadir: " + hadir);
        System.out.println("Izin: " + ijin);
        System.out.println("Sakit: " + sakit);
        System.out.println("Alpha: " + alpha);
        System.out.println("");
        int pilihan;
        System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
        System.out.print("Ketik 0 untuk kembali : ");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case (0) :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                sekreAbsensiSiswa();
                break;
            default :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. Silahkan coba lagi.",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                absensiSekre(classtype);
                break;
        }
        
        scanner.close();
        
    } 
//    ================================================>
    
    
//    untuk merekap data absensi SEKRETARIS ================================================>
    public void rekapAbsensiSekre(String classtype) {
         int hadir = 0;
        int ijin = 0;
        int sakit = 0;
        int alpha = 0;
        
       int i=1;
            for (Siswa siswa : siswa) {
                if(siswa.classType.equals(classtype))  {
            
            }
        }
            

    
        System.out.println("\nRekapan Absen Tanggal : " + formattedDateTime );
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.format("| No   | NISN / NIS                 | Nama Siswa                     | L/P  | Keterangan |%n");
        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        String tbl = "| %-4s | %-26s | %-30s | %-3s  | %-10s |%n";
        
        for (Siswa siswa : siswa) {
           if(siswa.classType.equals(classtype))  {
            System.out.printf("| %-4s | %-26s | %-30s | %-3s  | %-10s |%n",
                    (i++), siswa.nisnNis(), siswa.name(), siswa.gender(), siswa.statusKehadiran());
            
        }
            switch (siswa.statusKehadiran()) {
                    case "Hadir" -> hadir++;
                    case "Ijin" -> ijin++;
                    case "Sakit" -> sakit++;
                    case "Alpha"  -> alpha++;
                    default -> {
                 }
                }
        
       }

        System.out.format("+------+----------------------------+--------------------------------+------+------------+%n");
        System.out.println("");
        System.out.println("Keterangan : ");
        System.out.println("Hadir: " + hadir);
        System.out.println("Izin: " + ijin);
        System.out.println("Sakit: " + sakit);
        System.out.println("Alpha: " + alpha);
        System.out.println("");
        int pilihan;
        System.out.println("+------------------------------------------+");
                System.out.println("");
        System.out.print("Ketik 0 untuk kembali : ");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case (0) :
                System.out.println("+------------------------------------------+");
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                sekreRekapanAbsensi();
                break;
            default:
                System.out.println("+------------------------------------------+");
                System.out.println("");
                Style.showln("Maaf opsi yang anda pilih tidak ada. ",Style.RED);
                System.out.println("");
                System.out.println("<--------------> E-PRESENSI <-------------->");
                System.out.println("");
                rekapAbsensiSekre(classtype);
                break;
        }
    }
    
    
}
// ================================================>