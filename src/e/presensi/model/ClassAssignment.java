package e.presensi.model;

/**
 *
 * @author Haidir
 */
public class ClassAssignment {
    public String className;
    public String hari;
    public String pelajaran;
    public String judulTugas;
    
    public String ClassName() {return this.className;}
    public String Hari() {return this.hari;}
    public String Pelajaran() {return this.pelajaran;}
    public String KeteranganTugas() {return this.judulTugas;}
    
//    public ClassAssignment(String ClassSchedule, String Hari, String Pelajaran) {
//        this.className = ClassSchedule;
//        this.hari = Hari;
//        this.pelajaran = Pelajaran;
//        this.judulTugas = " ";
//    }
    
    public void setKeteranganTugas(String Keterangan){
        this.judulTugas = Keterangan;
    }
}
