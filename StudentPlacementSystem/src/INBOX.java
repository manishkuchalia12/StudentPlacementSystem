import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class User1 extends javax.swing.JFrame {
    static String sd1;

    String s1,s2;
    Statement stmt;
    public User1(String sid) {
        super("STUDENT ID");
        sd1=sid;
        initComponents();
        try{



            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/campus system","root","");
            stmt=(Statement) con.createStatement();
        }catch(Exception ee){}

        try {
            ResultSet rs=stmt.executeQuery("Select * from pass where idd='"+sd1+"'");
            rs.next();
            s1=rs.getString(1);
            s2=rs.getString(4);

        }catch(Exception ee){}
        l1.setText(s1);
        t2.setText(s2);
    }

    // Variables declaration - do not modify                      
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel t2;

} 