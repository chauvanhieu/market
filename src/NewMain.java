
import CLASS.Account;
import CLASS.config;
import CLASS.nhanVien;
import MODEL.MDAccount;
import MODEL.MDNhanVien;
import java.sql.SQLException;

public class NewMain {

    public static void main(String[] args) throws SQLException {
         nhanVien nv = MDNhanVien.getNhanVien("admin");
         System.out.println(nv.getNgaySinh());
    }

}
