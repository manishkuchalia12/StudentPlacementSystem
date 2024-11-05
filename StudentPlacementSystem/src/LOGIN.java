import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Admin3 extends javax.swing.JFrame {

    Statement stmt;
    String sd2;

    public Admin3() {
        super("ADMINISTRATOR LOGIN");
        initComponents();
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/campus_system", "root", "");
            stmt = con.createStatement();
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, ee);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JComboBox();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JPasswordField();
        t6 = new javax.swing.JComboBox();
        t7 = new javax.swing.JTextField();

        // Add your component initialization code here

    } // Closing brace for initComponents method

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JComboBox t3;
    private javax.swing.JTextField t4;
    private javax.swing.JPasswordField t5;
    private javax.swing.JComboBox t6;
    private javax.swing.JTextField t7;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin3().setVisible(true);
            }
        });
    }
}
