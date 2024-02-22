
package e.presensi.model;

/**
 *
 * @author Haidir
 */

public class StudentClass {
    public String className;
    public String[] senin;
    public String[] selasa;
    public String[] rabu;
    public String[] kamis;
    public String[] jumat;
    public String[] sabtu;
    
    public StudentClass( String className, String[] senin, String[] selasa, String[] rabu, String[] kamis, String[] jumat, String[] sabtu){
        this.className = className;
        this.senin = senin;
        this.selasa = selasa;
        this.rabu = rabu;
        this.kamis = kamis;
        this.jumat = jumat;
        this.sabtu = sabtu;
    }
    
}
