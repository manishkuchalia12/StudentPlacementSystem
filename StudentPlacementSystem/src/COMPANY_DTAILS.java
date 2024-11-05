import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author manish
 */
public class Admin4 extends javax.swing.JFrame {

    /**
     * Creates new form Admin4 
     */
    ResultSet rs4;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
    String cb1,cb2,cb3,cb4,cb5;
    Statement stmt;
    public Admin4() {
        initComponents();
        try{
            Class.forName("org.gjt.mm.mysql.Driver");


            Connection con=(Connection)
                    DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/campus system","root","");
            stmt=(Statement) con.createStatement();
        }catch(Exception ee){}
        int i=0; 
        /*try 
        { 
            ResultSet rs4=stmt.executeQuery("select idd from stdid2"); 
            while(rs4.next()) 
            {i++; 
                String w=rs4.getString(1); 
                System.out.println(i); 
                stmt.executeUpdate("Insert into comp values ('"+w+"','abc','abc','abc','abc')"); 
            } 
       }); 
    } 
 
    // Variables declaration - do not modify                      
    private javax.swing.JComboBox c1; 
    private javax.swing.JComboBox c2; 
    private javax.swing.JButton jButton1; 
    private javax.swing.JButton jButton2; 
    private javax.swing.JLabel jLabel1; 
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JLabel jLabel3; 
    private javax.swing.JLabel jLabel4; 
    private javax.swing.JLabel jLabel5; 
    private javax.swing.JLabel jLabel6; 
    private javax.swing.JComboBox t1; 
    private javax.swing.JComboBox t2; 
    private javax.swing.JComboBox t3; 

    
 
    private javax.swing.JComboBox t4; 
    private javax.swing.JComboBox t5; 
    private javax.swing.JComboBox t6; 
    private javax.swing.JComboBox t7; 
    // End of variables declaration                    
 
}
