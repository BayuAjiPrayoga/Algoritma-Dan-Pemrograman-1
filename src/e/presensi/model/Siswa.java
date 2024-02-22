package e.presensi.model;

/**
 *
 * @author Haidir
 */


public class Siswa {
    public String classType;
    public String name;
    public String nisnNis;
    public String gender;
    public String statusKehadiran;
    
    public String classType() {return this.classType;}
    public String name() {return this.name;}
    public String nisnNis() {return this.nisnNis;}
    public String gender() {return this.gender;}
    public String statusKehadiran() {return this.statusKehadiran;}
    
    public Siswa(String classType, String name, String nisnNis, String gender) {
        this.classType = classType;
        this.name = name;
        this.nisnNis = nisnNis;
        this.gender = gender;
        this.statusKehadiran = "-";
    }
    
    public void setStatusKehadiran(String status){
        this.statusKehadiran = status;
    }
    
}

